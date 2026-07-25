package functional_09.stream;

import java.util.Comparator;
import java.util.List;

public class StreamExample13 {
    static class Person {
        private String firstName;
        private String lastName;
        private int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() { return firstName; }
        public String getLastName() { return lastName; }
        public int getAge() { return age; }
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Иван", "Петров", 20),
                new Person("Александр", "Константинопольский", 45), // Полное имя > 15 симв. (игнорируем)
                new Person("Анна", "Седокова", 35),                 // Подходит по длине, старше Ивана
                new Person("Ольга", "Бузова", 18)
        );

        System.out.println(people.stream().filter(person -> (person.getFirstName() + " " + person.getLastName()).length() <= 15).max(Comparator.comparingInt(Person::getAge)).map(person -> person.getFirstName() + " " + person.getLastName()).orElse("Никто не найден"));


    }
}
