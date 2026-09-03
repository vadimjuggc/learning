package date_time_12;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Example3 {
    static void main(String[] args) {
        String str = "26-03-1968T09:24";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        System.out.println(dateTime);
        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.of("America/Chicago"));
        System.out.println(zonedDateTime.toInstant().toEpochMilli());
    }
}
