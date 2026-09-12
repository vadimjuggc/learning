package other;

import java.util.List;

public class ListOfList {
    public static void main(String[] args) {
        List<List<Integer>> nested = List.of(
                List.of(1, 2, 3),
                List.of(3, 4, 5),
                List.of(5, 6, 7)
        );

        nested.stream().flatMap(List::stream).distinct().sorted().forEach(System.out::println);
    }
}
