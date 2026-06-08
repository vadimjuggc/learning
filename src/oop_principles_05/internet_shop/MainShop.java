package oop_principles_05.internet_shop;

public class MainShop {
    static void main() {
        Product monitor = new Product(500, "monitor");
        DigitalProduct gpu = new DigitalProduct(1200, "gpu", "bfsdfsaf");
        monitor.DisplayInfo();
        gpu.displayDigitalInfo();
        gpu.setPrice(-100);
        monitor.DisplayInfo();
        gpu.displayDigitalInfo();
    }

}
