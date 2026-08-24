package io_streams_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Practice6 {
    public static void main(String[] args) {
        Path path = Path.of("resources", "text3.txt");
        try {
            String[] numbers = Files.readString(path).split("[^0-9]+");
            Arrays.stream(numbers).max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);
        }
        catch (IOException e)
        {

        }
    }
}
