package oop_principles_05.delivery;

public class PostDelivery extends Delivery {
    private final int cost = 150;

    public PostDelivery(String orderId, int distance)
    {
        super(orderId, distance);
    }

    @Override
    public double calculateCost() {
        return cost;
    }


}
