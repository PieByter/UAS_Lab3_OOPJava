// Interface untuk mengatur operasi kamar
public interface RoomOperations {
    void checkIn(int roomNumber, String guestName, String checkInDate);

    void checkOut(int roomNumber, String checkOutDate);

    void displayRoomStatus();
}
