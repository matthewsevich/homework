package by.matusevich.task35;

import by.matusevich.task01.Utility;

import java.io.IOException;

public class TestProgramm {
    public static void main(String[] args) throws IOException {

        String errorMessage = Utility.readString("Введите сообщение об ошибке");
        SimpleLogger.getSimpleLogger().addLog(errorMessage);

        SimpleLogger.getSimpleLogger().printToFile(SimpleLogger.getSimpleLogger().showLogFile(), "log.txt");
    }
}
