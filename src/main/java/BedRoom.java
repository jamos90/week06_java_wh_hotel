public class BedRoom extends Room {
    private int roomNumber;
    private int nightlyRate;
    private RoomType roomType;

    public BedRoom(int capacity, int roomNumber, int nightlyRate, RoomType roomType){
        super(capacity);
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
        this.roomType = roomType;
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }
}
