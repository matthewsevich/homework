package by.matusevich.task22;

import by.matusevich.task01.Utility;

public class Main {

    static TimeInterval timeDay = new TimeInterval();


    public static void main(String[] args) {

        int input = Utility.readNumber("Insert amount of hours: ");
        int input2 = Utility.readNumber("Insert amount of minutes: ");
        int input3 = Utility.readNumber("Insert amount of seconds: ");

        if (input < 0 || input2 < 0 || input3 < 0)
            System.out.println(" ERROR");
        else System.out.println(timeDay.toSeconds(input, input2, input3) + " seconds");

    }
}
