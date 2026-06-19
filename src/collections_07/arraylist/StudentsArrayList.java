package collections_07.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsArrayList {
    public static void main(String[] args) {
        ArrayList<String> groupOne = new ArrayList<>();
        ArrayList<String> groupTwo = new ArrayList<>();
        groupOne.add("Ivan Ivanov");
        groupOne.add("Ivan Ivanov");
        groupOne.add("Ivan Ivanov");
        groupOne.add("Vadim Guk");
        groupOne.add("Oleg Nudin");
        groupTwo.add("Marta Himova");
        groupTwo.add("Sergei Jugg");
        groupTwo.add("Sergei Jugg");

        System.out.println(groupOne);
        System.out.println(groupTwo);
        System.out.println(merge(groupOne, groupTwo));

    }

    static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b)
    {
        ArrayList<String> mergedStrings = new ArrayList<>();
        mergedStrings.addAll(a);
        mergedStrings.addAll(b);
        ArrayList<String> seen = new ArrayList<>();
        mergedStrings.removeIf(s -> {
            if (seen.contains(s)) return true;
            seen.add(s);
            return false;
        });
        Collections.sort(mergedStrings);
        return mergedStrings;
    }

}
