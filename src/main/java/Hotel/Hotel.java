package Hotel;

import Rooms.BedRoom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;

import java.util.ArrayList;

public class Hotel {
    protected ArrayList<BedRoom> bedRooms;
    protected ArrayList<ConferenceRoom> conferenceRooms;
//    protected ArrayList<> dinningRooms;

    public Hotel(){
        this.bedRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();

    }

//
//    public void addRoom(RoomType room) {
//        this.BedRooms.add;
//    }

    public int getBedroomCount() {
        return this.bedRooms.size();
    }

    public int getConferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addRoom(BedRoom bedroom) {
        this.bedRooms.add(bedroom);

    }

    public void addConferenceRoom(ConferenceRoom conferenceroom) {
        this.conferenceRooms.add(conferenceroom);
    }

    public BedRoom getBedroom(BedRoom bedroom) {
        return this.bedRooms.get(0);
    }
}
