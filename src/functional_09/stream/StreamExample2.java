package functional_09.stream;

import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(number -> number % 2 == 0).mapToInt(number -> number*number).sum();
        System.out.println(sum);
    }
}
