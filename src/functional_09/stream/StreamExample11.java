package functional_09.stream;

import java.util.Map;

public class StreamExample11 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "Java", 100,       // Длина ключа 4 (< 7) -> берем 100
                "Stream", 200,     // Длина ключа 6 (< 7) -> берем 200
                "Framework", 300,  // Длина ключа 9 (>= 7) -> игнорируем
                "Spring", 400      // Длина ключа 6 (< 7) -> берем 400
        );

        System.out.println(map.entrySet().stream().filter(value -> value.getKey().length()<7).mapToInt(value -> value.getValue()).sum());
    }
}
