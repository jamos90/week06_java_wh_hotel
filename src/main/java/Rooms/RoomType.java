package Rooms;

public enum RoomType {
    SINGLE_BEDROOM(1),
    DOUBLE_BEDROOM(2),
    CONFERENCE(40),
    DININGROOM(50);
    private final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }

}
