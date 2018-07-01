package Hotel;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guestList;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guestList = new ArrayList<>();

    }


    public int getCapacity() {
        return capacity;
    }

    public int getOccupants() {
        return this.guestList.size();
    }

    public String addPeopleToRoom(Guest guest) {
       if (getOccupants() < this.capacity) {
            this.guestList.add(guest);
        } else {
            return "This room is full";
        }
        return "This room is full";

    }

    public Boolean isFull(){
        if (getOccupants() == getCapacity()){
            return true;
        }
        return false;
    }



    public void removePeopleFromRoom() {
        this.guestList.clear();
    }

    public Guest roomOccupants() {
        Guest guestsInRoom = null;
        for (Guest guests : guestList) {
            if (guests != null){
                guestsInRoom = guests;
            }
        }
        return guestsInRoom;
    }
}




