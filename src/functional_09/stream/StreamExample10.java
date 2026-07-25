package functional_09.stream;

import java.util.List;

public class StreamExample10 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "Framework",     // 9 симв. (уникальная)
                "StreamAPI",     // 9 симв. (дубликат 1)
                "StreamAPI",     // 9 симв. (дубликат 2)
                "Java",          // короткая
                "Collection",    // 10 симв. (уникальная)
                "Code"           // короткая
        );
        System.out.println(strings.stream().distinct().filter(s -> s.length()>8).count());
    }
}
