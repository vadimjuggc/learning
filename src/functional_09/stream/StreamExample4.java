package functional_09.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample4 {
    static class User {
        private String name;
        private int age;

        public User(String name, int age) { this.name = name; this.age = age; }
        public String getName() { return name; }
        public int getAge() { return age; }

        // Добавим toString, чтобы при выводе карты в консоль всё красиво отображалось
        @Override
        public String toString() { return name + " (" + age + ")"; }
    }

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Петр", 20),
                new User("Анна", 17),
                new User("Иван", 20),
                new User("Ольга", 14),
                new User("Алексей", 17)
        );

        Map<Integer, List<User>> sortedUsers = users.stream().collect(Collectors.groupingBy(User::getAge));
        sortedUsers.forEach((age, list) -> System.out.println(age + " лет -> " + list));
    }
}
