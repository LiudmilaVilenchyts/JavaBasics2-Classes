public class Hotel{
    private String hotelName;
    private String address;
    private boolean isOpen;
    private List<Room> rooms = new ArrayList<Room>();
    private int starRating;
}

public class Room{
    private int numberOfBedrooms;
    private boolean isFree;
    private int price;
}
