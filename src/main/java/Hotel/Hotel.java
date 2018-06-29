package Hotel;

import Rooms.BedRoom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;

import java.util.ArrayList;

public class Hotel {
    protected ArrayList<BedRoom> BedRooms;
    protected ArrayList<ConferenceRoom> conferenceRooms;
//    protected ArrayList<> dinningRooms;

    public Hotel(){
        this.BedRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();

    }

//
//    public void addRoom(RoomType room) {
//        this.BedRooms.add;
//    }

    public int getBedroomCount() {
        return this.BedRooms.size();
    }

    public int getConferenceRoomCount() {
        return this.conferenceRooms.size();
    }
}
