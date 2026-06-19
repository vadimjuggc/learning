package collections_07.linkedlist;

import java.util.LinkedList;

public class StackRunner {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        integers.push(4);

        System.out.println("peek: " + integers.peek());
        System.out.println();

        while (!integers.isEmpty())
        {
            System.out.println(integers.pop());
        }
    }
}
