package by.matusevich.task35;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Programm {
    public static void main(String[] args) throws IOException {


        SimpleLogger.getSimpleLogger().showLogFile();
        SimpleLogger.getSimpleLogger().addLog("asdkmaskdmaksdkmamsd");
        SimpleLogger.getSimpleLogger().showLogFile();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        String k = dateFormat.format(cal.getTime());

        SimpleLogger.getSimpleLogger().printToFile(k, "error message" + " " + k, "log.txt");
    }
}
