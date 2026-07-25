package functional_09.stream;

import java.util.List;

public class StreamExample9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 10, 15, 20, 25, 33, 45, 50);
        System.out.println(numbers.stream().filter(number -> number % 2 != 0).filter(number -> number % 5 == 0).mapToInt(number -> number).average().orElse(0));

    }
}
