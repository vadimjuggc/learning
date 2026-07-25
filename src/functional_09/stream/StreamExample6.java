package functional_09.stream;

import java.util.List;

public class StreamExample6 {
    static class User {
        private String name;
        private int age;

        public User(String name, int age) { this.name = name; this.age = age; }
        public String getName() { return name; }
        public int getAge() { return age; }
    }

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Петр", 20),
                new User("Анна", 25),
                new User("Иван", 35)
        );

        System.out.println(users.stream().mapToInt(User::getAge).max().orElse(0));
    }
}


