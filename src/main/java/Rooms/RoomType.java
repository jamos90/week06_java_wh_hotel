package Rooms;

public enum RoomType {
    SINGLE_BEDROOM(1),
    DOUBLE_BEDROOM(2),
    SUITE(2),
    HONEYMOONSUITE(2),
    FAMILYROOM(5);
    private final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }

}
