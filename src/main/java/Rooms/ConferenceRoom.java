package Rooms;

public class ConferenceRoom extends Hotel.Room {
    private String name;
    private int dailyRate;
    private RoomType roomType;

    public ConferenceRoom(int capacity, String name, int dailyRate){
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
        this.roomType = roomType;
    }

    public String getName() {
        return name;
    }

    public int getDailyRate() {
        return dailyRate;
    }
}
