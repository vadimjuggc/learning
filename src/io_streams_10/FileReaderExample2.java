package io_streams_10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class FileReaderExample2 {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "log.txt").toFile();
        try (FileReader fileReader = new FileReader(file)) {
            char[] buffer = new char[5];
            int count;
            while ((count = fileReader.read(buffer)) != -1)
                System.out.print(new String(buffer, 0, count));
        }
    }
}
