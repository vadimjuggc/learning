package collections_07.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRunner {
    static void main() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integers.add(i);
        }
        System.out.println(integers);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext())
        {
            Integer i = iterator.next();
            if (i%2!=0)
                iterator.remove();
        }
        System.out.println(integers);
    }
}
