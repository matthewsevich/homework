package by.matusevich.task31;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class NumberFinder {

    public static void NubmberFinder(String data) throws NumberFormatException {
        String[] numbers = data.split(" ");
        int numberSumm = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            for (String word : numbers) {
                System.out.println(word);
                int number = Integer.parseInt(word);
                arrayList.add(number);
                numberSumm += number;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("сумма: " + numberSumm);
        Set<Integer> set = new LinkedHashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(set);
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
    }
}