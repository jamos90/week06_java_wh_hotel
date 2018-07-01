import Hotel.Guest;
import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    ConferenceRoom conferenceRoom2;
    Guest guest;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom(2,"The Amber Room",250, true);
        conferenceRoom2 = new ConferenceRoom(1,"Room2",150, false);
        guest = new Guest("Stephen",304);
        guest1 = new Guest("Allan",320);
        guest2 = new Guest("Sally",200);
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

    @Test
    public void canAddToRoom(){
        conferenceRoom.addPeopleToRoom(guest);
        conferenceRoom.addPeopleToRoom(guest2);
        assertEquals(2,conferenceRoom.getOccupants());
    }

    @Test
    public void cannotAddToRoomIfFull(){
        conferenceRoom.addPeopleToRoom(guest);
        conferenceRoom.addPeopleToRoom(guest2);
        conferenceRoom.addPeopleToRoom(guest3);
        assertEquals(2,conferenceRoom.getOccupants());
    }
}
