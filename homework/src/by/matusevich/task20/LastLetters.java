package by.matusevich.task20;

import by.matusevich.task01.Utility;

public class LastLetters {
    public static void main(String[] args) {
        String str = Utility.readString("Введите строку для вывода последних букв из каждого слова");
        char symbol;

        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (((symbol == ',') || (symbol == '.')
                    || (symbol == '?') || (symbol == '!')
                    || (symbol == ':') || (symbol == ';')
                    || (symbol == '-') || (symbol == ' '))
                    && (Character.isLetter(str.charAt(i - 1))))

                System.out.print(str.charAt(i - 1) + " ");

        }
        if (Character.isLetter(str.charAt(str.length() - 1)))
            System.out.print(str.charAt(str.length() - 1));
    }


}

