package other.Practice8;

import java.util.Random;

public class ConsumerThread implements Runnable{
    private final Storage storage;
    private final Random random = new Random();

    public ConsumerThread(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            try {
                long num = random.nextLong(10L);
                storage.consume();
                System.out.println("Consumer заснул на " + num);
                Thread.sleep(num);
            } catch (InterruptedException e) {
                System.out.println("Поток Consumer прерван ");
                break;
            }
        }
    }
}
