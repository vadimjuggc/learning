package date_time_12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;

public class Example6
{
    static void main() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.with(temporal -> temporal.plus(47L, ChronoUnit.HOURS));
        System.out.println(localDateTime);
        System.out.println(localDateTime1);
    }
}
