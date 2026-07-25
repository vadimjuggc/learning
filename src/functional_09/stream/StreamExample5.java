package functional_09.stream;

import java.util.stream.IntStream;

public class StreamExample5 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 100).average());

    }
}
