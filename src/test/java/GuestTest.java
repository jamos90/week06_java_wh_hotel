import Hotel.Guest;
import Rooms.BedRoom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {


    Guest guest;
    Guest guest2;
    BedRoom room;
    BedRoom room2;
    ConferenceRoom conferenceroom;
    ConferenceRoom conferenceroom2;

    @Before
    public void setUP(){
        guest = new Guest("James", 350);
        guest2 = new Guest("James", 45);
        room = new BedRoom(30,45,50,RoomType.SINGLE_BEDROOM);
        room2 = new BedRoom(0,45,50,RoomType.SINGLE_BEDROOM);
        conferenceroom = new ConferenceRoom(30,"The Stag Suite",250, true);
        conferenceroom2 = new ConferenceRoom(30,"The Doe Suite",250, false);


    }


    @Test
    public void hasName(){
        assertEquals("James", guest.getName());
    }

    @Test
    public void hasWalletAmount(){
        assertEquals(350, guest.getWalletAmmount(), 0.01);
    }

    @Test
    public void canPayForRoom(){
        guest.paysForBedRoom(room);
        assertEquals(300,guest.getWalletAmmount(),0.01);
    }

    @Test
    public void cannotPayForBedRoom(){
        guest2.paysForBedRoom(room);
        assertEquals(45,guest2.getWalletAmmount(),0.01);
    }

    @Test
    public void cannotPayForBedRoomIfFull(){
        guest.paysForBedRoom(room2);
        assertEquals(350, guest.getWalletAmmount(), 0.1);
    }

    @Test
    public void canPayForConferenceRoom(){
        guest.paysForConferenceRoom(conferenceroom);
        assertEquals(100,guest.getWalletAmmount(),0.1);
    }

    @Test
    public void cannotPayForConferenceRoomBooked(){
        guest.paysForConferenceRoom(conferenceroom);
        assertEquals(350,guest.getWalletAmmount(),0.1);
    }
    


}
