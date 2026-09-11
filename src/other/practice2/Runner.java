package other.practice2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Runner {
    static void main(String[] args) {
        Predicate<String> predicate = a -> a.length() > 5;
        System.out.println(predicate.test("Hello"));
        Function<String, Integer> function = a -> a.length();
        System.out.println(function.apply("wasted "));
        Consumer<String> consumer = a -> System.out.println(a);
        consumer.accept("power");
        Supplier<String> stringSupplier = () -> "Hello";
        System.out.println(stringSupplier.get());
    }
}
