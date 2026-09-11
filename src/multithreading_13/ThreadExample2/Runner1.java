package multithreading_13.ThreadExample2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Runner1 extends Thread{
    public void run()
    {
        try {
           List<String> lines = Files.readAllLines(Path.of("resources","text4.txt"));
           int sum = lines.stream().mapToInt(Integer::parseInt).sum();
           System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
