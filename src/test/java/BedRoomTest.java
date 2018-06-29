import Rooms.BedRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {
    BedRoom bedRoom;

    @Before
    public void setUp(){
        bedRoom = new BedRoom(2, 34, 50, RoomType.DOUBLE_BEDROOM);
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(2, bedRoom.getCapacity());
    }

    @Test
    public void roomHasRoomNUmber(){
        assertEquals(34,bedRoom.getRoomNumber());
    }

    @Test
    public void roomHasNightlyRate(){
        assertEquals(50,bedRoom.getNightlyRate());
    }

    @Test
    public void roomHasType(){
        assertEquals(RoomType.DOUBLE_BEDROOM,bedRoom.getRoomType());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedRoom.getOccupants());
    }



}
