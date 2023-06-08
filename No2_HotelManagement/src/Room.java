// Parent Class Room
public class Room {
    private int roomNumber;
    private String guestName = null;
    private String status;

    // Getter & Setter
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Overloading Constructor
    public Room(int roomNumber, String status) {
        this.roomNumber = roomNumber;
        this.status = status;
        this.guestName = null;
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.status = getStatus();
        this.guestName = null;
    }

    public void checkIn(String guestName) {
        this.guestName = guestName;
        System.out.println("Tamu " + this.guestName + " check-in ke kamar " + roomNumber);
    }

    public void checkOut() {
        System.out.println("Tamu " + this.guestName + " check-out dari kamar " + roomNumber);
        this.guestName = null;
    }

    public void displayStatus() {
        System.out.println("Nomor Kamar: " + roomNumber);
        System.out.println("Status: " + status);
        System.out.println("------------------------");
    }

    // Inner Class
    public class RoomFacilities {
        private boolean wifi;
        private boolean tv;
        private boolean ac;
        private boolean hotWater;

        public RoomFacilities(boolean wifi, boolean tv, boolean ac, boolean hotWater) {
            this.wifi = wifi;
            this.tv = tv;
            this.ac = ac;
            this.hotWater = hotWater;
        }

        public boolean isWifi() {
            return wifi;
        }

        public boolean isTv() {
            return tv;
        }

        public boolean isAc() {
            return ac;
        }

        public boolean isHotWater() {
            return hotWater;
        }

        public void displayFacilities() {
            System.out.println("Fasilitas Kamar:");
            System.out.println("WiFi: " + (wifi ? "Tersedia" : "Tidak Tersedia"));
            System.out.println("TV: " + (tv ? "Tersedia" : "Tidak Tersedia"));
            System.out.println("AC: " + (ac ? "Tersedia" : "Tidak Tersedia"));
            System.out.println("Air Panas: " + (hotWater ? "Tersedia" : "Tidak Tersedia"));
        }
    }
}
