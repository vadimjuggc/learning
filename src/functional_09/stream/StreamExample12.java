package functional_09.stream;

import java.util.List;

public class StreamExample12 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 4, 2, 1);
        System.out.println(numbers.stream().map(String::valueOf).reduce("", (result, s) -> result + s));
    }
}
