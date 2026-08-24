package io_streams_10;

import java.io.*;
import java.nio.file.Path;

public class Practice3 {
    public static void main(String[] args) {
        File file = Path.of("resources", "input.txt").toFile();
        String targetWord = "мне";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int counter = 0;
            String line;
            while ((line = reader.readLine()) != null)
            {
                if (line.contains(targetWord)) counter++;
            }
            System.out.println("Слово " + "^" + targetWord + "^ встретилось " + counter + " раз");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
