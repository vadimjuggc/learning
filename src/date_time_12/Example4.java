package date_time_12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Example4 {
    static void main() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2018, 7, 7);
        System.out.println(Period.between(localDate, localDate1));
        System.out.println(ChronoUnit.SECONDS.between(localDate.atStartOfDay(), localDate1.atStartOfDay()));
    }
}
