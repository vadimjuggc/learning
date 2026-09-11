package other.practice6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Runner {
    static void main(String[] args) {
        List<String> cities = List.of("Minsk", "Moscow", "Berlin", "Madrid", "Milan", "Brest");
        cities.stream().filter(string -> string.startsWith("M")).sorted(Comparator.comparingInt(String::length)).findFirst().ifPresent(System.out::println);
        System.out.println(cities.stream().filter(string -> string.startsWith("M")).count());
    }
}
