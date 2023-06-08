import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner untuk input data
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kamar hotel: ");
        int numRooms = scanner.nextInt();

        HotelManager hotelManager = new HotelManager(numRooms);

        int choice;
        // Perulangan do-while
        do {
            // Exception Handling - Modul VII (7)
            try {
                System.out.println("\n===== Manajemen Hotel =====");
                System.out.println("1. Info Hotel (Status Kamar)");
                System.out.println("2. Check-In");
                System.out.println("3. Check-Out");
                System.out.println("4  Pembayaran");
                System.out.println("5. Laporan Hotel");
                System.out.println("6. Riwayat penggunaan ruangan");
                System.out.println("7. Fasilitas Ruangan");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Info Hotel
                        System.out.println("\n====== Info Hotel ======");
                        System.out.println("Daftar Kamar Tersedia:");
                        System.out.println("------------------------");
                        hotelManager.displayRoomStatus();
                        System.out.println();
                        break;

                    case 2:
                        // Check-In
                        System.out.print("Nomor kamar: ");
                        int roomNumber = scanner.nextInt();
                        scanner.nextLine(); // Membuang karakter newline
                        System.out.print("Nama tamu: ");
                        String guestName = scanner.nextLine();
                        System.out.print("Tanggal Check-In: ");
                        String checkInDate = scanner.nextLine();
                        hotelManager.checkIn(roomNumber, guestName, checkInDate);
                        break;

                    case 3:
                        // Check-In
                        System.out.print("Nomor kamar: ");
                        roomNumber = scanner.nextInt();
                        scanner.nextLine(); // Membuang karakter newline
                        System.out.print("Tanggal Check-Out: ");
                        String checkOutDate = scanner.nextLine();
                        // Checkout hotel
                        System.out.println("====== Checkout Hotel ======");
                        hotelManager.checkOut(roomNumber, checkOutDate);
                        break;

                    case 4:
                        System.out.print("Nomor kamar: ");
                        roomNumber = scanner.nextInt();
                        // Melakukan pembayaran
                        System.out.println("======= Pembayaran =======");
                        hotelManager.bayarKamar(roomNumber);
                        System.out.println();
                        break;

                    case 5:
                        // Melihat laporan hotel
                        LaporanHotel laporanHotel = new LaporanHotel();
                        System.out.println("====== Laporan Hotel ======");
                        laporanHotel.cetakLaporanRiwayat(hotelManager);
                        laporanHotel.cetakLaporanPendapatanHarian();
                        System.out.println();
                        break;

                    case 6:
                        System.out.print("Nomor kamar: ");
                        roomNumber = scanner.nextInt();
                        if (roomNumber <= numRooms) {
                            LaporanHotel.cetakRiwayatKamar(roomNumber, hotelManager);
                        } else {
                            System.out.println("Kamar tidak tersedia.");
                        }
                        break;

                    case 7:
                        System.out.println("\nJenis Ruangan:");
                        System.out.println("1. Single Room ");
                        System.out.println("2. Double Room \n");
                        System.out.println("Cek Fasilitas:");
                        int jenisRuangan = scanner.nextInt();
                        scanner.nextLine();
                        if (jenisRuangan == 1) {
                            Room room = new Room(1);
                            // Membuat objek RoomFacilities
                            Room.RoomFacilities roomFacilities = room.new RoomFacilities(false, true, true, false);
                            // Memanggil metode displayFacilities()
                            roomFacilities.displayFacilities();
                        } else if (jenisRuangan == 2) {
                            Room room = new Room(2);
                            // Membuat objek RoomFacilities
                            Room.RoomFacilities roomFacilities = room.new RoomFacilities(true, true, true, true);
                            // Memanggil metode displayFacilities()
                            roomFacilities.displayFacilities();
                        }else{
                            System.out.println("Jenis ruangan tidak ada.....");
                        }
                        break;

                    case 0:
                        System.out.println("Terima kasih telah menggunakan program ini.");
                        break;

                    default:
                        throw new IllegalArgumentException("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("\nTerjadi kesalahan: " + e.getMessage());
                choice = -1; // Set choice ke nilai yang tidak valid untuk mengulangi loop
            }
        } while (choice != 0);

        scanner.close();
    }
}
