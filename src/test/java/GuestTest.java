import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {


    Guest guest;

    @Before
    public void setUP(){
        guest = new Guest("James", 350);
    }

    @Test
    public void hasName(){
        assertEquals("James", guest.getName());
    }

    @Test
    public void hasWalletAmount(){
        assertEquals(350, guest.getWalletAmmount(), 0.01);
    }


}
