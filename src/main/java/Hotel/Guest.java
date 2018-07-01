package Hotel;

import Rooms.BedRoom;
import Rooms.ConferenceRoom;

public class Guest {
    private String name;
    private double wallet;
    
    
    public Guest(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }


    public String getName() {
        return name;
    }

    public double getWalletAmmount() {
        return this.wallet;
    }

    public void paysForBedRoom(BedRoom room) {
        if (this.wallet >= room.getNightlyRate()&& !room.isFull()) {
            this.wallet -= room.getNightlyRate();
        }
    }

    public void paysForConferenceRoom(ConferenceRoom confroom){
        if (this.wallet >= confroom.getDailyRate() && !confroom.isBooked()){
            this.wallet -= confroom.getDailyRate();
        }
    }


}

  
