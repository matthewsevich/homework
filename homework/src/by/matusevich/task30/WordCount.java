package by.matusevich.task30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    public static void wordCount(String data) {
        String str = data + " ";
        int count = 0;
        int countP = 0;
        Pattern pattern = Pattern.compile("[!\"#$%&'()*+,\\-./:;<=>?@\\[\\]^_`{|}~]");
        Matcher matcher = pattern.matcher(str);

        for (int i = 0; i < str.length(); i++) {
            if ((Character.isLetter(str.charAt(i))) && !(Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
            if (matcher.find()) {
                countP++;
            }
        }

        System.out.println("number of punctuation marks: " + countP);
        System.out.println("Number of words in sentence is: " + count);
    }
}
