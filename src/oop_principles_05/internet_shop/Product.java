package oop_principles_05.internet_shop;

public class Product {
    private double price;
    private String name;

    public Product(double price, String name)
    {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price > 0) this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void DisplayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Price " + price);
    }
}
