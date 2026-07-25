package functional_09.stream;

import java.util.Comparator;
import java.util.List;

public class StreamExample3 {
    static class User {
        private String name;
        private int age;

        public User(String name, int age) { this.name = name; this.age = age; }
        public String getName() { return name; }
        public int getAge() { return age; }
    }

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Петр", 25),
                new User("Анна", 17),
                new User("Иван", 30),
                new User("Ольга", 14),
                new User("Алексей", 22)
        );

        List<String> sorted = users.stream().filter(user -> user.getAge() > 18).sorted(Comparator.comparing(User::getName)).map(user -> user.getName()).toList();
        sorted.forEach(System.out::println);
    }
}
