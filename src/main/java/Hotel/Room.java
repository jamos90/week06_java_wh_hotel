package Hotel;

import Hotel.Guest;

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

    public void addPeopleToRoom(Guest guest){
        this.guestList.add(guest);

    }

    public void removePeopleFromRoom(){
        this.guestList.clear();
    }


}
