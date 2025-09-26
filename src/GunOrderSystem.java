import java.util.ArrayList;
import java.util.List;

public class GunOrderSystem {
    private List<GunOrder> orders;

    public GunOrderSystem() {
        orders = new ArrayList<>();
    }

    public void addOrder(GunOrder order) {
        orders.add(order);
    }

    public void listOrders() {
        System.out.println("\n=== Gun Orders ===");
        for (GunOrder order : orders) {
            System.out.println(order);
        }
        System.out.println("==================");
    }

    public double totalAmount() {
        double total = 0;
        for (GunOrder order : orders) {
            total += order.getTotalPrice();
        }
        return total;
    }
}
