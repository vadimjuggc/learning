package oop_principles_05.delivery;

public class CourierDelivery extends Delivery {

    private final int cost = 5;
    public CourierDelivery(int distance, String orderId)
    {
        super(orderId, distance);
    }

    @Override
    public double calculateCost() {
        return cost*getDistance();
    }
}
