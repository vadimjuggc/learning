package oop_principles_05.delivery;

abstract public class Delivery {
    private String orderId;
    private int distance;

    public Delivery(String orderId, int distance)
    {
        this.distance = distance;
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getDistance() {
        return distance;
    }

    public abstract double calculateCost();

    public void printReceipt()
    {
        System.out.println("Заказ №" + orderId + " Стоимость доставки: " + calculateCost() + " руб.");
    }
}
