package oop_principles_05.internet_shop;

public class DigitalProduct extends Product {
    private String url;
    public DigitalProduct(double price, String name, String url)
    {
        super(price, name);
        this.url = url;
    }


    public void displayDigitalInfo()
    {
        System.out.println("Digital product: " + getName());
        System.out.println("Digital product price: " + getPrice());
        System.out.println("URL: " + url);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
