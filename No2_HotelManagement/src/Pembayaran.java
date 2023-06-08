import java.util.ArrayList;
import java.util.List;

public class Pembayaran {
    private String metodePembayaran;
    private double totalHarga;
    private String tanggalPembayaran;
    private static List<Pembayaran> pembayaranList = new ArrayList<>();

    // Overloading Constructor
    public Pembayaran(String metodePembayaran, double totalHarga, String tanggalPembayaran) {
        this.metodePembayaran = metodePembayaran;
        this.totalHarga = totalHarga;
        this.tanggalPembayaran = tanggalPembayaran;
        pembayaranList.add(this); // Dimasukkan ke history pembayaran
    }

    public Pembayaran(String metodePembayaran, double totalHarga) {
        this.metodePembayaran = metodePembayaran;
        this.totalHarga = totalHarga;
        this.tanggalPembayaran = "Secure";
        pembayaranList.add(this); // Dimasukkan ke history pembayaran
    }

    // Getter and Setter Methods
    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public void setTanggalPembayaran(String tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public static List<Pembayaran> getPembayaranList() {
        return pembayaranList;
    }

    public void setPembayaranList(List<Pembayaran> pembayaranList) {
        Pembayaran.pembayaranList = pembayaranList;
    }

    public static double getTotalPendapatan() {
        double total = 0.0;
        for (Pembayaran pembayaran : pembayaranList) {
            total += pembayaran.getTotalHarga();
        }
        return total;
    }

    public void lakukanPembayaran() {
        System.out.println("Pembayaran sebesar " + totalHarga + " dengan metode " + metodePembayaran
                + " pada tanggal " + tanggalPembayaran + " telah dilakukan.");
    }

}
