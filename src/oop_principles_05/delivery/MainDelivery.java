package oop_principles_05.delivery;

public class MainDelivery {
    static void main(String[] args) {
    Delivery courier = new CourierDelivery(30, "1442");
    courier.printReceipt();
    Delivery post = new PostDelivery("2344", 130);
    post.printReceipt();
    }
}
