package collections_07.dmdevpracticecollections;

import java.util.ArrayList;
import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
            list.add(i);
        }
        System.out.println(list);
        System.out.println(countUnique(list));

    }

    public static int countUnique(ArrayList<Integer> list)
    {
        HashSet<Integer> set = new HashSet<>();
        int a = 0;
        for (Integer i : list) {
            if(set.add(i))
                a++;
        }
        return a;
    }
}
