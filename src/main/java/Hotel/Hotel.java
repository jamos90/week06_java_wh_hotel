package Hotel;

import Rooms.BedRoom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;
import Hotel.Room;

import java.util.ArrayList;

public class Hotel {
    protected ArrayList<BedRoom> bedRooms;
    protected ArrayList<ConferenceRoom> conferenceRooms;
//    protected ArrayList<> dinningRooms;
    protected Room room;

    public Hotel() {
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

    public BedRoom findBedRoom(RoomType roomtype) {
        BedRoom availableroom = null;
        for (BedRoom bedroom : bedRooms)
            if (bedroom.getRoomType() == roomtype) {
            availableroom = bedroom;
            }
        return availableroom;

    }

    public void addPersonToRoom(Guest guest, RoomType roomtype)
    {
        room = findBedRoom(roomtype);
        room.addPeopleToRoom(guest);
    }


//    public void canCheckPeopleIntoRooms(Guest guest) {
//        addPeopleToRoom(guest);
////
//    }


}