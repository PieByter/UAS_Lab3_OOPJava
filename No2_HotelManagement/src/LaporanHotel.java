import java.util.List;

public class LaporanHotel {

    public static void cetakLaporanRiwayat(HotelManager hotelManager) {
        System.out.println("Laporan Riwayat Penggunaan Kamar:\n");
        hotelManager.cetakRiwayatCheckIn();
        hotelManager.cetakRiwayatCheckOut();
    }

    public static void cetakRiwayatKamar(int roomNumber, HotelManager hotelManager) {
        System.out.println("Laporan Riwayat Penggunaan Kamar " + roomNumber + " \n");
        hotelManager.cetakRiwayatCheckInKamar(roomNumber);
        hotelManager.cetakRiwayatCheckOutKamar(roomNumber);
    }

    public static void cetakLaporanPendapatanHarian() {
        System.out.println("--------------------------");
        System.out.println("    Laporan Pendapatan    ");
        System.out.println("--------------------------");
        List<Pembayaran> pembayaranList = Pembayaran.getPembayaranList();
        if (pembayaranList.isEmpty()) {
            System.out.println("History pembayaran kosong.");
        } else {
            int pembayaranListSize = pembayaranList.size();
            for (int i = 0; i < pembayaranListSize; i++) {
                Pembayaran pembayaran = pembayaranList.get(i);
                System.out.println("Metode Pembayaran: " + pembayaran.getMetodePembayaran());
                System.out.println("Total Harga: " + pembayaran.getTotalHarga());
                System.out.println("Tanggal Pembayaran: " + pembayaran.getTanggalPembayaran());
                System.out.println("--------------------------");

                if (i == pembayaranListSize - 1 && pembayaranList.get(i).equals(pembayaran)) {
                    double totalPendapatan = Pembayaran.getTotalPendapatan();
                    System.out.println("Total: " + totalPendapatan);
                }
            }

        }
    }
}

