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
    Guest guest;

    @Before
    public void setUp() {
        hotel = new Hotel();
        bedroom = new BedRoom(1,50, 50, RoomType.DOUBLE_BEDROOM);
        bedroom2 = new BedRoom(3,34,40,RoomType.DOUBLE_BEDROOM);
        bedroom3 = new BedRoom(2,70,70,RoomType.DOUBLE_BEDROOM);
        conferenceroom = new ConferenceRoom(50,"Confroom 1",200);
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
    public void canCheckPeopleInandOutOfRooms(){
        hotel.addRoom(bedroom);
        hotel.findBedRoom(RoomType.DOUBLE_BEDROOM);
        hotel.addPersonToRoom(guest,RoomType.DOUBLE_BEDROOM);
        assertEquals(1, bedroom.getOccupants());
        hotel.checkOut(RoomType.DOUBLE_BEDROOM);
        assertEquals(0,bedroom.getOccupants());

    }

    @Test
    public void canCheckPeopleOutofRooms(){
        hotel.addRoom(bedroom);
        hotel.findBedRoom(RoomType.DOUBLE_BEDROOM);
        hotel.addPersonToRoom(guest,RoomType.DOUBLE_BEDROOM);
        hotel.checkOut(RoomType.DOUBLE_BEDROOM);
        assertEquals(0,bedroom.getOccupants());

    }

}

