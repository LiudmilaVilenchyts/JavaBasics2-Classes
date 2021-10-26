public class Delivery{
    private String workingHours;
    private int deliveryZone;
    private List<Dish> menu = new ArrayList<Dish>();
}

public class Dish{
    private String name;
    private String contents;
    private int price;
}