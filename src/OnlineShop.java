public class OnlineShop{
    private String url;
    private String name;
    private List<Item> catalog = new ArrayList<Item>();
}

public class Item{
    private int price;
    private String name;
    private String description;
    private String category;
}