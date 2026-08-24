package io_streams_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Practice8 {
    static void main(String[] args) {
        Path path = Path.of("resources", "Code.java");
        try {
            List <String> list = Files.readAllLines(path);
            List <String> newlist = list.stream().map(line -> new StringBuffer(line).reverse().toString()).toList();
            Files.write(path, newlist);
        } catch (IOException e) {

        }
    }
}
