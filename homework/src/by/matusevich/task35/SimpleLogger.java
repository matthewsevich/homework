package by.matusevich.task35;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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

    public void addLog(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }

    public boolean printToFile(String date,String logFile,String filename) throws IOException {
        try (FileOutputStream fos=new FileOutputStream(filename)){
                fos.write(date.getBytes());
                fos.write(logFile.getBytes());
                fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
