package io_streams_10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class FileReaderExample1 {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "log.txt").toFile();
        try(FileReader fileReader = new FileReader(file)) {
            int c;
            while ((c = fileReader.read()) != -1)
                System.out.print((char) c);
        }
    }
}
