import Hotel.Hotel;
import Rooms.BedRoom;
import Rooms.ConferenceRoom;
import Hotel.Guest;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    BedRoom bedroom;
    BedRoom bedroom2;
    BedRoom bedroom3;
    ConferenceRoom conferenceroom;
    ConferenceRoom conferenceroom2;
    Guest guest;

    @Before
    public void setUp() {
        hotel = new Hotel(500,600);
        bedroom = new BedRoom(1,50, 50, RoomType.DOUBLE_BEDROOM);
        bedroom2 = new BedRoom(3,34,40,RoomType.SINGLE_BEDROOM);
        bedroom3 = new BedRoom(2,70,70,RoomType.DOUBLE_BEDROOM);
        conferenceroom = new ConferenceRoom(50,"Confroom 1",200, true);
        conferenceroom2 = new ConferenceRoom(34,"Room2",300, false);
        guest = new Guest("James",403);


    }

    @Test
    public void hotelHasNoBedRooms() {
        assertEquals(0, hotel.getBedroomCount());
    }

    @Test
    public void hotelHasNoConferenceRooms() {
        assertEquals(0, hotel.getConferenceRoomCount());
    }

    @Test
    public void canAddBedroomRoom() {
        hotel.addRoom(bedroom);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void  canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceroom);
        assertEquals(1,hotel.getConferenceRoomCount());
    }

//    @Test
//    public void canGetCapacityFromArray(){
//        hotel.addConferenceRoom(conferenceroom);
//        assertEquals(50, .getCapacity());
//    }

    @Test
    public void canGetBedRoom(){
        hotel.addRoom(bedroom);
        hotel.addRoom(bedroom2);
        hotel.addRoom(bedroom3);
        assertEquals(bedroom, hotel.getBedroom(bedroom));
    }

    @Test
    public void canCheckPeopleInToRooms(){
        hotel.addRoom(bedroom);
        hotel.findBedRoom(RoomType.DOUBLE_BEDROOM);
        hotel.addPersonToRoom(guest,RoomType.DOUBLE_BEDROOM);
        assertEquals(1, bedroom.getOccupants());

    }

    @Test
    public void canCheckPeopleOutofRooms(){
        hotel.addRoom(bedroom);
        hotel.findBedRoom(RoomType.DOUBLE_BEDROOM);
        hotel.addPersonToRoom(guest,RoomType.DOUBLE_BEDROOM);
        hotel.checkOut(RoomType.DOUBLE_BEDROOM);
        assertEquals(0,bedroom.getOccupants());
    }

    @Test
    public void canSeeWhoIsInRoom(){
        hotel.addRoom(bedroom);
        hotel.findBedRoom(RoomType.DOUBLE_BEDROOM);
        hotel.addPersonToRoom(guest,RoomType.DOUBLE_BEDROOM);
        assertEquals(guest, hotel.findIfGuestIsInRoom(RoomType.DOUBLE_BEDROOM));

    }

    @Test
    public void canGetNameOfGuest(){
        hotel.addRoom(bedroom);
        hotel.findBedRoom(RoomType.DOUBLE_BEDROOM);
        hotel.addPersonToRoom(guest,RoomType.DOUBLE_BEDROOM);
        assertEquals("James", hotel.findIfGuestIsInRoomName(RoomType.DOUBLE_BEDROOM));

    }

    @Test
    public void canCheckEmptyRooms(){
        hotel.addRoom(bedroom);
        hotel.addRoom(bedroom2);
        hotel.addPersonToRoom(guest,RoomType.DOUBLE_BEDROOM);
        assertEquals(bedroom, hotel.findEmptyRun(RoomType.DOUBLE_BEDROOM));
    }

    @Test
    public void hotelCanTakeMoney(){
        hotel.addRoom(bedroom);
        hotel.hotelTakesMoneyFromGuest(guest,bedroom);
        assertEquals(550, hotel.getTillAmmount(), 0.1 );
    }


    @Test
    public void hotelCanTakeMoneyForConferences(){
        hotel.addConferenceRoom(conferenceroom);
        hotel.hotelTakesMoneyFromGuestConferencePayment(guest, conferenceroom);
        assertEquals(800, hotel.getConferenceTillAmount(),0.1);
    }

    @Test
    public void hotelHasTotalTakings(){
        assertEquals(1100,hotel.getTotalTakings(),0.1);
    }

}

