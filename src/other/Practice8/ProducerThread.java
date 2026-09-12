package other.Practice8;

import java.util.Random;

public class ProducerThread implements  Runnable{
    private final Storage storage;
    private final Random random = new Random();

    public ProducerThread(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int num = random.nextInt();
                storage.produce(num);
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                System.out.println("Поток Producer прерван ");
                break;
            }
        }
    }
}
