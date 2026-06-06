package oop_01;

public class TimeInterval {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeInterval(int seconds, int minutes, int hours)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeInterval(int seconds)
    {
        hours = seconds/3600;
        minutes = seconds % 3600 / 60;
        this.seconds = seconds % 3600 % 60;
    }

    public int getTotalSeconds ()
    {
      return seconds + minutes*60 + hours*3600;
    }

    public void ShowInterval()
    {
        System.out.println("hours: " + this.hours + " minutes: " + this.minutes + " seconds: " + this.seconds);
    }
}
