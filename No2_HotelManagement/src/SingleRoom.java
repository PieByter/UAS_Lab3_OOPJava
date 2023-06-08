// Child class SingleRoom yang mewarisi dari Room
public class SingleRoom extends Room {
    private double price;
    private String jenisKamar;

    // Overloading Constructor
    public SingleRoom() {
        this(1, "Tersedia", 650_000);
    }

    public SingleRoom(int roomNumber) {
        this(roomNumber, "Tersedia", 650_000);
    }

    public SingleRoom(int roomNumber, String status, double price) {
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
        return "Single Room";
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
