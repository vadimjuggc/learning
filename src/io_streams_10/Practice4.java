package io_streams_10;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {
        Path path = Path.of("resources", "text1.txt");
        String s = "аеёиоуыэюя";
        try
        {
            String[] words = Files.readString(path).split("\\s+");
            Arrays.stream(words).filter(word -> s.contains(String.valueOf (word.toLowerCase().charAt(0)))).forEach(System.out::println);

        }
        catch (IOException e) {
        e.printStackTrace();
    }
    }
}
