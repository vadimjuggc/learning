package multithreading_13.ThreadExample2;

import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import java.nio.file.Path;

public class PracticeRunner {
    static void main(String[] args) throws InterruptedException {
        Path path = Path.of("resources","text4.txt");
        Runner1 runner2 = new Runner1();
        Thread runner1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                int value = new java.util.Random().nextInt(100);
                String text = String.valueOf(value) + '\n';
                System.out.println(value);
                try {
                    Files.writeString(path, text, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        runner1.start();
        runner1.join();
        runner2.start();
        runner2.join();
    }
}
