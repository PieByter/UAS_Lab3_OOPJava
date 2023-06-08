// Exception Class
class PerangkatException extends Exception {
    public PerangkatException(String message) {
        super(message);
    }
}

// Kelas parent  untuk perangkat elektronik
public class PerangkatElektronik {
    private String nama;
    private String merek;

    public PerangkatElektronik(String nama, String merek) {
        this.nama = nama;
        this.merek = merek;
    }

    public String getNama() {
        return nama;
    }

    public String getMerek() {
        return merek;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public void nyalakan() throws PerangkatException {
        throw new PerangkatException("Perangkat tidak dapat dinyalakan.");
    }

    public void matikan() {

    }

}
