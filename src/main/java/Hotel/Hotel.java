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
    protected double till;

    public Hotel(double till) {
        this.bedRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.till = till;



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


    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);

    }


    public BedRoom getBedroom(BedRoom bedroom) {
        return this.bedRooms.get(0);
    }

    public BedRoom findBedRoom(RoomType roomtype) {
        BedRoom availableroom = null;
        for (BedRoom bedroom : bedRooms)
            if (bedroom.getRoomType() == roomtype  && bedroom.getOccupants() < bedroom.capacity) {
            availableroom = bedroom;
            }
        return availableroom;

    }

    public void addPersonToRoom(Guest guest, RoomType roomtype)
    {
        room = findBedRoom(roomtype);
        room.addPeopleToRoom(guest);
    }

    public void checkOut(RoomType roomtype){
        room = findBedRoom(roomtype);
        room.removePeopleFromRoom();
    }

    public Guest findIfGuestIsInRoom(RoomType roomtype){
        room = findBedRoom(roomtype);
        return room.roomOccupants();
    }

    public String findIfGuestIsInRoomName(RoomType roomtype){
        room = findBedRoom(roomtype);
        Guest guests = room.roomOccupants();
        return guests.getName();


    }

    public Room findEmptyRun(RoomType roomtype) {
        Room emptyRoom = null;
        for (BedRoom bedroom : bedRooms)
            if (bedroom.getRoomType() == roomtype && bedroom.getOccupants() == 0) {
                emptyRoom = bedroom;
            }
        return emptyRoom;

    }

    public void hotelTakesMoneyFromGuest(Guest guest, BedRoom room){
         guest.paysForBedRoom(room);
         this.till += room.getNightlyRate();
    }

    public double getTillAmmount() {
        return this.till;
    }

//    public


//    public void canCheckPeopleIntoRooms(Guest guest) {
//        addPeopleToRoom(guest);
////
//    }


}