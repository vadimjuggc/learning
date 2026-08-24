package io_streams_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Practice5 {
    public static void main(String[] args) {
        Path path = Path.of("resources", "text2.txt");
        try {
            String[] words = Files.readString(path).split("\\s+");
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].toLowerCase().charAt(words[i].length() - 1) == words[i + 1].toLowerCase().charAt(0))
                    System.out.println(words[i] + " " + words[i+1]);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error");
        }
    }
}
