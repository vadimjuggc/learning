package functional_09.stream;

import java.util.List;

public class StreamExample7 {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Stream", "API", "Framework", "Code");
        System.out.println(words.stream().reduce("", (result, word) -> result.length()>word.length() ? result : word));
    }
}
