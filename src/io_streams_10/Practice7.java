package io_streams_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Practice7 {
    public static void main(String[] args) {
        Path path = Path.of("resources", "Code.java");
        try
        {
            String line = Files.readString(path);
            String newline = line.replace("public", "private");
            Files.writeString(path, newline);
        }
        catch (IOException e)
        {

        }
    }
}
