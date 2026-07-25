package functional_09.stream;

import java.util.List;

public class StreamExample8 {
    static class Product {
        private String name;
        private int price;

        public Product(String name, int price) { this.name = name; this.price = price; }
        public int getPrice() { return price; }
    }

    public static void main(String[] args) {
        List<Product> cart = List.of(
                new Product("Ноутбук", 50000),
                new Product("Мышка", 1500),
                new Product("Клавиатура", 3000)
        );

        System.out.println(cart.stream().map(Product::getPrice).reduce(0,Integer::sum));
    }
}
