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
    protected double bedroomTill;
    protected double conferenceTill;

    public Hotel(double bedroomTill, double conferenceTill) {
        this.bedRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bedroomTill = bedroomTill;
        this.conferenceTill = conferenceTill;
    }

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

    public BedRoom findEmptyRun(RoomType roomtype) {
        BedRoom emptyRoom = null;
        for (BedRoom bedroom : bedRooms)
            if (bedroom.getRoomType() == roomtype && bedroom.getOccupants() == 0) {
                emptyRoom = bedroom;
            }
        return emptyRoom;

    }

    public void hotelTakesMoneyFromGuest(Guest guest, BedRoom room){
         guest.paysForBedRoom(room);
         this.bedroomTill += room.getNightlyRate();
    }

    public void hotelTakesMoneyFromGuestConferencePayment(Guest guest, ConferenceRoom room){
        guest.paysForConferenceRoom(room);
        this.conferenceTill += room.getDailyRate();
    }

    public double getTillAmmount() {
        return this.bedroomTill;
    }

    public double getTotalTakings(){
        return this.bedroomTill + this.conferenceTill;
    }


    public double getConferenceTillAmount() {
        return this.conferenceTill;
    }
}