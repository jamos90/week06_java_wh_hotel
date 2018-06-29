import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guestList;

    public Room(int capacity){
        this.capacity = capacity;
        this.guestList = new ArrayList<>();

    }


    public int getCapacity() {
        return capacity;
    }

    public int getOccupants() {
        return this.guestList.size();
    }
}
