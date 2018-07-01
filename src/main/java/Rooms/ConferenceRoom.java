package Rooms;

public class ConferenceRoom extends Hotel.Room {
    private String name;
    private int dailyRate;

    public ConferenceRoom(int capacity, String name, int dailyRate){
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;

    }

    public String getName() {
        return name;
    }

    public int getDailyRate() {
        return dailyRate;
    }

}
