package functional_09.stream;

import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Иван", "Анна", "Александр", "Ольга", "Антон");
        List<String> result = names.stream().filter(name -> name.startsWith("А")).map(String::toUpperCase).toList();
        result.forEach(System.out::println);
    }
}
