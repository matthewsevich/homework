package by.matusevich.task31;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class NumberFinder {

    public static void Finder(String data) {
        String[] numbers = data.split(" +");
        int numberSumm = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String word : numbers) {
            int number;
            if (word.matches("\\d+")) {
                number = Integer.parseInt(word);
                arrayList.add(number);
                numberSumm += number;
            }
        }
        System.out.println("cумма= " + numberSumm);
        System.out.println("Только числа");
        System.out.println(arrayList);
        Set<Integer> set = new LinkedHashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(set);
        System.out.println("минус повторяющиеся числа");
        System.out.println(set);

    }
}