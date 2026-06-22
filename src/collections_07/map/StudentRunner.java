package collections_07.map;

import java.util.HashMap;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("vasya", 6);
        Student student2 = new Student("vadim", 7);
        Student student3 = new Student("oleg", 8);
        Student student4 = new Student("sasha", 9);
        Student student5 = new Student("alena", 4);

        HashMap<String, Integer> map = new HashMap<>();

        map.put(student1.getName(), student1.getMark());
        map.put(student2.getName(), student2.getMark());
        map.put(student3.getName(), student3.getMark());
        map.put(student4.getName(), student4.getMark());
        map.put(student5.getName(), student5.getMark());
        int max = 0;
        String name = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()>7)
                System.out.println(entry);
            if(entry.getValue()>max) {
                max = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println("student: " + name + " max mark: " + max);
    }
}
