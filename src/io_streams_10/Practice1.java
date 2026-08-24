package io_streams_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        Path path = Path.of("resources", "prices.txt");
        try {
            List <String> list = Files.readAllLines(path);
            list.stream().mapToInt(Integer::parseInt).min().ifPresent(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
