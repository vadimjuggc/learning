package collections_07.equals;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentRunner {
   public static void main(String[] args) {
       Student student1 = new Student(12, "vasya");
       Student student2 = new Student(12, "vasya");
       Student student3 = new Student(13, "egor");
       Student student4 = new Student(12, "anya");

/*
       System.out.println(student1.hashCode());
       System.out.println(student2.hashCode());
       System.out.println(student2.equals(student1));
       System.out.println();
       System.out.println(student3.hashCode());
       System.out.println(student4.hashCode());
       System.out.println(student3.equals(student4));
*/
       ArrayList<Student> students = new ArrayList<>();
       students.add(student1);
       students.add(student2);
       students.add(student3);
       students.add(student4);
       System.out.println(students);
       Iterator<Student> iterator = students.iterator();
       ArrayList<Student> seen = new ArrayList<>();
       while (iterator.hasNext())
       {
           Student student = iterator.next();
           if (seen.contains(student))
               iterator.remove();
           else
               seen.add(student);
       }
       System.out.println(students);
    }
}
