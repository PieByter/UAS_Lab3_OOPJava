// Child class DoubleRoom yang mewarisi dari Room
public class DoubleRoom extends Room {
    private double price;
    private String jenisKamar;

    // Overloading Constructor
    public DoubleRoom() {
        this(1, "Tersedia", 1_400_000);
    }

    public DoubleRoom(int roomNumber) {
        this(roomNumber, "Tersedia", 1_400_000);
    }

    public DoubleRoom(int roomNumber, String status, double price) {
        super(roomNumber, status);
        this.price = price;
    }

    // Getter and Setter Methods
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getJenisKamar() {
        return "Double Room";
    }

    public void setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    @Override
    public void displayStatus() {
        System.out.println("Nomor Kamar: " + getRoomNumber());
        System.out.println("Jenis Kamar: " + getJenisKamar());
        System.out.println("Status: " + getStatus());
        if (getStatus() != "tersedia") {
            System.out.println("Tamu: " + getGuestName());
        }
        System.out.println("------------------------");
    }
}
