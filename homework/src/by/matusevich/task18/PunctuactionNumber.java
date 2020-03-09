package by.matusevich.task18;

import by.matusevich.task01.Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuactionNumber {
    public static void main(String[] args) {
        String str = Utility.readString("Введите строку, для подсчета знаков препинания");
        Pattern pattern = Pattern.compile("[!\"#$%&'()*+,\\-./:;<=>?@\\[\\]^_`{|}~]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
