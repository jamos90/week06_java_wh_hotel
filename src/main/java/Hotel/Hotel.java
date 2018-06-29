package Hotel;

import Rooms.RoomType;

import java.util.ArrayList;

public class Hotel {
    protected ArrayList<RoomType> singleRooms;
    protected ArrayList<RoomType> conferenceRooms;
    protected ArrayList<RoomType> doubleRooms;
    protected ArrayList<RoomType> dinningRooms;

    public Hotel(){
        this.singleRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.doubleRooms = new ArrayList<>();
        this.dinningRooms = new ArrayList<>();

    }


    public int getSingleRoomCount() {
        return this.singleRooms.size();
    }

    public void addRoom(RoomType room_type) {
        this.singleRooms.add(room_type);
    }
}
