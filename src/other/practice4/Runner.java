package other.practice4;

import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    static void main(String[] args) {
        List<String> names = List.of("alice", "bob", "charlie", "dan", "eve", "sophia", "max");
        names.stream().filter(string -> string.length()>4).map(String::toUpperCase).sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
