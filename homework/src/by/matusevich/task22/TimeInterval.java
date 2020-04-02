package by.matusevich.task22;

public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public int toSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    public TimeInterval() {
        seconds = 0;
        minutes = 0;
        hours = 0;
    }

    public TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeInterval(int timeInSeconds) {
        this.seconds = timeInSeconds % 60;
        int minutesWOseconds = (timeInSeconds - this.seconds) / 60;
        minutes = minutesWOseconds % 60;
        int hoursWOminutes = (minutesWOseconds - minutes) / 60;
        System.out.println("В " + timeInSeconds + " секунд: " + hoursWOminutes + " часов " + minutes + " минут " + this.seconds + " секунд");
    }

    public int compareTo(TimeInterval timeInterval) {
        return this.toSeconds() - timeInterval.toSeconds();
    }
}
