package oop_principles_05.enum_day_of_week;

public enum DayOfWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekend;

    DayOfWeek(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public void printSchedule()
    {
        if (isWeekend)
            System.out.println("Day off");
        else
            System.out.println("Work day");
    }
}
