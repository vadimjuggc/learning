package io_streams_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        List<String> logs = List.of(
                "14:00 [INFO] User logged in",
                "14:02 [ERROR] Database connection failed",
                "14:05 [WARN] Low memory",
                "14:10 [ERROR] Payment timeout"
        );
        Path targetPath = Path.of("resources", "errors.txt");
        List<String> errors = logs.stream().filter(string -> string.contains("[ERROR]")).toList();
        try
        {
            Files.write(targetPath, errors);
        }
        catch (IOException e)
        {
            throw e;
        }
    }
}
