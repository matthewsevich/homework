package by.matusevich.task35;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleLogger {
    private static SimpleLogger logger;
    private static String logFile = "LogFile here... \n\n";

    public static synchronized SimpleLogger getSimpleLogger() {
        if (logger == null) {
            logger = new SimpleLogger();
        }
        return logger;
    }

    private SimpleLogger() {

    }

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Calendar cal = Calendar.getInstance();
    String dateOflog = dateFormat.format(cal.getTime());

    public void addLog(String logInfo) {
        logFile += logInfo + " " + dateOflog + "\n";
    }

    public String showLogFile() {
        return logFile;
    }

    public boolean printToFile(String logFile, String filename) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(logFile.getBytes());
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
