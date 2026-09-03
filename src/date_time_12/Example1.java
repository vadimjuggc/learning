package date_time_12;

import java.time.LocalDateTime;

public class Example1 {
    static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2020, 6, 25, 19, 47);
        LocalDateTime timeAfter = time.plusMonths(3L);
        System.out.println(timeAfter.toLocalTime());
        System.out.println(timeAfter.toLocalDate());
    }
}
