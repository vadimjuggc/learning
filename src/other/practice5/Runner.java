package other.practice5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }
        System.out.println(list.stream().filter(integer -> integer%2==0).map(integer -> integer*3).reduce(0, (integer, integer2) -> integer+integer2));
    }
}
