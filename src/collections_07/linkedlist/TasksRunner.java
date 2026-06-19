package collections_07.linkedlist;

import java.util.LinkedList;

public class TasksRunner {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.addLast("start");
        tasks.addLast("increment");
        tasks.addLast("decrement");
        tasks.addLast("minus");
        tasks.addLast("end");

        while (!tasks.isEmpty()){
            System.out.println("Обрабатывается: " + tasks.pollFirst());
        }
    }
}
