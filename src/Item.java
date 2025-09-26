package activity2;

public class Item {
    // Attributes
    private String itemName;
    private double price;
    private int sold;
    private int stock;

    // Constructor
    public Item(String itemName, double price, int stock) {
        this.itemName = itemName;
        this.price = price;
        this.stock = stock;
        this.sold = 0;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getSold() {
        return sold;
    }

    public int getStock() {
        return stock;
    }

    public void logDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Sold: " + sold);
        System.out.println("----------------------------");
    }

    public void buy() {
        if (stock > 0) {
            sold++;
            stock--;
            System.out.println("You bought 1 " + itemName);
        } else {
            System.out.println("Sorry, no stock left for " + itemName);
        }
    }

    public void returnItem() {
        if (sold > 0) {
            sold--;
            stock++;
            System.out.println("You returned 1 " + itemName);
        } else {
            System.out.println("No items to return for " + itemName);
        }
    }
}
