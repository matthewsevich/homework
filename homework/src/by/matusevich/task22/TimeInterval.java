package by.matusevich.task22;

import by.matusevich.task01.Utility;

public class TimeInterval {
    int seconds1;
    int minutes, m;
    int hours, h;
    int totalseconds;


    public int toSeconds(int hours, int minutes, int seconds) {
        totalseconds = hours * 3600 + minutes * 60 + seconds;
        return totalseconds;

    }


}
