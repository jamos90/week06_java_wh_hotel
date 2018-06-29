import Hotel.Hotel;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void setUp(){
        hotel = new Hotel();
    }

    @Test
    public void hotelHasNoSingleRooms(){
        assertEquals(0, hotel.getSingleRoomCount());
    }

    @Test
    public void hotelCanAddRooms(){
        hotel.addRoom(RoomType.SINGLE_BEDROOM);
        assertEquals(1, hotel.getSingleRoomCount());
    }

    @Test
    public
}
