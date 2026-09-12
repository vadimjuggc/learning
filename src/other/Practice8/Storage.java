package other.Practice8;

import java.util.LinkedList;
import java.util.List;

public class Storage {
    private final LinkedList<Integer> list = new LinkedList<>();

    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == 10) {
            wait();
        }
        list.add(value);
        System.out.println("Producer added " + value + " to list   Size: " + list.size());
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (list.isEmpty()) {
            wait();
        }
        int removed = list.removeFirst();
        System.out.println("Consumer removed " + removed + " from list Size: " + list.size());
        notifyAll();
    }
}
