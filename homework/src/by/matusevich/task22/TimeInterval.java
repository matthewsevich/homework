package by.matusevich.task22;

public class TimeInterval {
    int seconds;
    int minutes, minutesWOseconds;
    int hoursWOminutes, hours;
    int totalseconds;


    public int toSeconds(int hours, int minutes, int seconds) {
        totalseconds = hours * 3600 + minutes * 60 + seconds;
        return totalseconds;

    }

    public int fromSeconds(int timeToConvert) {
        seconds = timeToConvert % 60;
        minutesWOseconds = (timeToConvert - seconds) / 60;
        minutes = minutesWOseconds % 60;
        hoursWOminutes = (minutesWOseconds - minutes) / 60;
        System.out.println("В " + timeToConvert + " секунд: " + hoursWOminutes + " часов " + minutes + " минут " + seconds + " секунд");


        return 0;
    }


}
