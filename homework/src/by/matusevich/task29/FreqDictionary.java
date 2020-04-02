package by.matusevich.task29;

import by.matusevich.task01.Utility;

import java.util.*;

public class FreqDictionary {
    public static void main(String[] args) {
        String text = Utility.readString("Введите строку для частотного словаря");

        freqVocabulary(text);

    }

    public static void freqVocabulary(String string) {

        Map<String, Integer> map = new HashMap<>();

        String[] words = string.split("[!\"#$%&'()*+ ,\\-./:;<=>?@\\[\\]^_`{|}~]");

        for (String word : words) {

            String tempWord = word.toLowerCase();
            if (map.containsKey(tempWord)) {
                map.put(tempWord, map.get(tempWord) + 1);
            } else {
                map.put(tempWord, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("слово - " + entry.getKey()
                    + "\t\t\t" + "встречается " + entry.getValue() + " раз");
        }

    }
}

