package io_streams_10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class FOSExamlpe1 {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        try (FileOutputStream outputStream = new FileOutputStream(file, true))
        {
            String text = "Hello world";
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            outputStream.write(bytes);
            outputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
        }
    }
}
