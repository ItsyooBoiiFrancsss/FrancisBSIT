public class GunOrder {
    private String gunName;   // name of the gun
    private int quantity;     // how many
    private double unitPrice; // price for one unit

    public GunOrder(String gunName, int quantity, double unitPrice) {
        this.gunName = gunName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getGunName() {
        return gunName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return quantity + " x " + gunName + " @ $" + unitPrice + " each = $" + getTotalPrice();
    }
}
