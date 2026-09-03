package date_time_12;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example5 {
    static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(ZonedDateTime.ofInstant(instant, ZoneId.of("Africa/Cairo")));
    }
}
