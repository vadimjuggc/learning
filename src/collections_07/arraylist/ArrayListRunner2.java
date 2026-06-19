package collections_07.arraylist;

import java.util.ArrayList;

public class ArrayListRunner2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(5);
        integers.add(8);
        integers.add(9);
        System.out.println(integers);
        System.out.println(removeDuplicates(integers));
    }

    static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arrayList)
    {
        ArrayList<Integer> uniqueIntegers = new ArrayList<>();
        for (Integer i : arrayList) {
            if (!uniqueIntegers.contains(i))
                uniqueIntegers.add(i);
        }
        return uniqueIntegers;
    }
}
