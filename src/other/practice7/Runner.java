package other.practice7;

import java.util.Comparator;
import java.util.List;

public class Runner {
    static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apple", "cherry", "banana", "date", "cherry", "fig");
        words.stream().distinct().map(String::length).max(Comparator.comparingInt(Integer::intValue)).ifPresent(System.out::println);

    }
}
