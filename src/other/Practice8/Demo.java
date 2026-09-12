package other.Practice8;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Storage storage = new Storage();

        ProducerThread producerTask1 = new ProducerThread(storage);
        ProducerThread producerTask2 = new ProducerThread(storage);
        ConsumerThread consumerTask = new ConsumerThread(storage);

        Thread producerThread1 = new Thread(producerTask1);
        Thread producerThread2 = new Thread(producerTask2);
        Thread consumerThread = new Thread(consumerTask);

        producerThread1.start();
        producerThread2.start();
        consumerThread.start();

    }
}
