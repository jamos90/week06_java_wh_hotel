import Hotel.Hotel;
import Rooms.BedRoom;
import Rooms.ConferenceRoom;
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

    @Before
    public void setUp() {
        hotel = new Hotel();
        bedroom = new BedRoom(1,50, 50, RoomType.DOUBLE_BEDROOM);
        bedroom2 = new BedRoom(3,34,40,RoomType.DOUBLE_BEDROOM);
        bedroom3 = new BedRoom(2,70,70,RoomType.DOUBLE_BEDROOM);
        conferenceroom = new ConferenceRoom(50,"Confroom 1",200);


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
        assertEquals(bedroom, hotel.getBedroom(bedroom3));
    }

}

