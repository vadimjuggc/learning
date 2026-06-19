package collections_07.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRunner {
    static void main() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("vadim");
        stringArrayList.add("masha");
        stringArrayList.add("sad");
        stringArrayList.add("egor");
        stringArrayList.add("tax");
        stringArrayList.removeIf(s -> s.length() < 4);
        Collections.sort(stringArrayList);
        stringArrayList.add("Unknown");
        System.out.println(stringArrayList);
    }
}
