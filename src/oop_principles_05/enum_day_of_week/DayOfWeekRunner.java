package oop_principles_05.enum_day_of_week;

public class DayOfWeekRunner {
    static void main() {
        for (DayOfWeek day: DayOfWeek.values()) {
            day.printSchedule();
        }

    }
}
