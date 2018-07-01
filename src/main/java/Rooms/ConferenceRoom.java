package Rooms;

public class ConferenceRoom extends Hotel.Room {
    private String name;
    private int dailyRate;
    private boolean booked;

    public ConferenceRoom(int capacity, String name, int dailyRate, boolean booked){
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
        this.booked = booked;
    }

    public String getName() {
        return name;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public boolean isBooked(){
        if (this.booked == true){
            return true;
        }
        return false;
    }

}
