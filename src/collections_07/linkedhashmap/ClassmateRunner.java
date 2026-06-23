package collections_07.linkedhashmap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClassmateRunner {
    public static void main(String[] args) {

        List<Classmate> classmates = Arrays.asList(
                new Classmate(12, "vasya"),
                new Classmate(15, "oleg"),
                new Classmate(13, "egor"),
                new Classmate(12, "anya"),
                new Classmate(14, "sasha"));

        classmates.sort(Comparator.comparingInt(Classmate::getAge).thenComparing(Classmate::getName));
        for (Classmate classmate : classmates) {
            System.out.println(classmate.getName() + " , age: " + classmate.getAge());
        }

    }


}
