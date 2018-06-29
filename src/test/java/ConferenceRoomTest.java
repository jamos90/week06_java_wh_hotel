import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom(34,"The Amber Room",250);
    }

    @Test
    public void hasCapacity(){
        assertEquals(34, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("The Amber Room",conferenceRoom.getName());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(250, conferenceRoom.getDailyRate());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoom.getOccupants());
    }
}
