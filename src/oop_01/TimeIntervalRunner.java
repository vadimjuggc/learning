package oop_01;


public class TimeIntervalRunner {
    static void main() {
        TimeInterval timeInterval = new TimeInterval(35, 56, 3);
        timeInterval.ShowInterval();
        System.out.println("Всего секунд: " + timeInterval.getTotalSeconds());
        TimeInterval timeInterval1 = new TimeInterval(timeInterval.getTotalSeconds());
        timeInterval1.ShowInterval();
    }
}
