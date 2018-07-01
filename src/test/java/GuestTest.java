import Hotel.Guest;
import Rooms.BedRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {


    Guest guest;
    Guest guest2;
    BedRoom room;
    BedRoom room2;

    @Before
    public void setUP(){
        guest = new Guest("James", 350);
        guest2 = new Guest("James", 45);
        room = new BedRoom(30,45,50,RoomType.SINGLE_BEDROOM);
        room2 = new BedRoom(0,45,50,RoomType.SINGLE_BEDROOM);

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
        guest.paysForRoom(room);
        assertEquals(300,guest.getWalletAmmount(),0.01);
    }

    @Test
    public void cannotPayForRoom(){
        guest2.paysForRoom(room);
        assertEquals(45,guest2.getWalletAmmount(),0.01);
    }

    @Test
    public void cannotPayForRoomIfFull(){
        guest.paysForRoom(room2);
        assertEquals(350, guest.getWalletAmmount(), 0.1);
    }


}
