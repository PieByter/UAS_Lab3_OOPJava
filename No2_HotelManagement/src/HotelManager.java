import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManager implements RoomOperations {
    private Room[] rooms;
    Scanner scanner = new Scanner(System.in);
    private List<String> riwayatCheckIn = new ArrayList<>();
    private List<String> riwayatCheckOut = new ArrayList<>();
    private List<List<String>> riwayatCheckInKamar = new ArrayList<>();
    private List<List<String>> riwayatCheckOutKamar = new ArrayList<>();

    public HotelManager(int numRooms) {
        rooms = new Room[numRooms];
        for (int i = 0; i < numRooms; i++) {
            if (i % 2 == 0) {
                rooms[i] = new SingleRoom(i + 1, "tersedia", 650_000.0); // Set harga kamar tunggal
                rooms[i].setGuestName(null);
            } else {
                rooms[i] = new DoubleRoom(i + 1, "tersedia", 1_400_000.0); // Set harga kamar double
                rooms[i].setGuestName(null);
            }
            // Membuat Nested List Kosong untuk diisi
            riwayatCheckInKamar.add(new ArrayList<>());
            riwayatCheckOutKamar.add(new ArrayList<>());
        }
    }


    @Override
    public void checkIn(int roomNumber, String guestName, String checkInDate) {
        if (roomNumber >= 1 && roomNumber <= rooms.length) {
            if (rooms[roomNumber - 1].getStatus() == "tersedia") {
                rooms[roomNumber - 1].checkIn(guestName);
                rooms[roomNumber - 1].setStatus("tidak tersedia");
                riwayatCheckIn.add("Tamu " + guestName + " di kamar " + roomNumber + " tanggal " + checkInDate);
                riwayatCheckInKamar.get(roomNumber - 1).add("Check-in: Tamu " + guestName + " tanggal " + checkInDate);
            } else {
                System.out.println("Kamar sudah ditempati oleh " + rooms[roomNumber - 1].getGuestName());
            }
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    @Override
    public void checkOut(int roomNumber, String checkOutDate) {
        if (roomNumber >= 1 && roomNumber <= rooms.length && rooms[roomNumber - 1].getStatus() == "tidak tersedia") {
            riwayatCheckOut.add("Tamu " + rooms[roomNumber - 1].getGuestName() + " dari kamar " + roomNumber + " tanggal " + checkOutDate);
            riwayatCheckOutKamar.get(roomNumber - 1).add("Check-out: Tamu " + rooms[roomNumber - 1].getGuestName() + " tanggal " + checkOutDate);
            rooms[roomNumber - 1].checkOut();
            rooms[roomNumber - 1].setStatus("tersedia");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    public void cetakRiwayatCheckInKamar(int roomNumber) {
        System.out.println("----------------------------");
        System.out.println("  Riwayat Check-in Kamar " + roomNumber);
        System.out.println("----------------------------");
        List<String> riwayatCheckIn = getRiwayatCheckInKamar(roomNumber);
        if (riwayatCheckIn.isEmpty()) {
            System.out.println("Belum ada riwayat check-in.");
        } else {
            for (String riwayat : riwayatCheckIn) {
                System.out.println(riwayat);
            }
        }
        System.out.println("----------------------------\n");
    }

    public void cetakRiwayatCheckOutKamar(int roomNumber) {
        System.out.println("----------------------------");
        System.out.println("  Riwayat Check-out Kamar " + roomNumber);
        System.out.println("----------------------------");
        List<String> riwayatCheckOut = getRiwayatCheckOutKamar(roomNumber);
        if (riwayatCheckOut.isEmpty()) {
            System.out.println("Belum ada riwayat check-out.");
        } else {
            for (String riwayat : riwayatCheckOut) {
                System.out.println(riwayat);
            }
        }
        System.out.println("----------------------------\n");
    }


    public void cetakRiwayatCheckIn() {
        System.out.println("------------------------------");
        System.out.println("        Riwayat Check-in      ");
        System.out.println("------------------------------");
        if (riwayatCheckIn.isEmpty()) {
            System.out.println("Belum ada riwayat check-in.");
        } else {
            for (String riwayat : riwayatCheckIn) {
                System.out.println(riwayat);
            }
        }
        System.out.println("------------------------------\n");
    }

    public void cetakRiwayatCheckOut() {
        System.out.println("------------------------------");
        System.out.println("       Riwayat Check-out      ");
        System.out.println("------------------------------");
        if (riwayatCheckOut.isEmpty()) {
            System.out.println("Belum ada riwayat check-out.");
        } else {
            for (String riwayat : riwayatCheckOut) {
                System.out.println(riwayat);
            }
        }
        System.out.println("------------------------------\n");
    }

    @Override
    public void displayRoomStatus() {
        for (Room room : rooms) {
            room.displayStatus();
        }
    }

    public void bayarKamar(int roomNumber) {
        if (roomNumber >= 1 && roomNumber <= rooms.length && rooms[roomNumber - 1].getGuestName() != "Kosong") {
            if (rooms[roomNumber - 1] instanceof SingleRoom) {
                double price = ((SingleRoom) rooms[roomNumber - 1]).getPrice();
                System.out.println("Total harga: " + price);
                System.out.print("Metode pembayaran: ");
                String metodePembayaran = scanner.nextLine();
                System.out.print("Tanggal pembayaran: ");
                String tanggal = scanner.nextLine();
                Pembayaran pembayaran = new Pembayaran(metodePembayaran, price, tanggal);
                pembayaran.lakukanPembayaran();
            } else if (rooms[roomNumber - 1] instanceof DoubleRoom) {
                double price = ((DoubleRoom) rooms[roomNumber - 1]).getPrice();
                System.out.println("Total harga: " + price);
                System.out.print("Metode pembayaran: ");
                String metodePembayaran = scanner.nextLine();
                System.out.print("Tanggal pembayaran: ");
                String tanggal = scanner.nextLine();
                Pembayaran pembayaran = new Pembayaran(metodePembayaran, price, tanggal);
                pembayaran.lakukanPembayaran();
            } else {
                System.out.println("Kamar tidak valid.");
            }
        } else {
            System.out.println("Kamar tidak ditemukan.");
        }
    }

    public Room getRoom(int roomNumber) {
        if (roomNumber >= 1 && roomNumber <= rooms.length) {
            return rooms[roomNumber - 1];
        } else {
            return null;
        }
    }

    public List<String> getRiwayatCheckInKamar(int roomNumber) {
        if (roomNumber >= 1) {
            return riwayatCheckInKamar.get(roomNumber - 1);
        }
        return new ArrayList<>();
    }

    public List<String> getRiwayatCheckOutKamar(int roomNumber) {
        if (roomNumber >= 1) {
            return riwayatCheckOutKamar.get(roomNumber - 1);
        }
        return new ArrayList<>();
    }


}
