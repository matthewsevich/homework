package by.matusevich.task28;

import by.matusevich.task01.Utility;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class MaxMark {
    public static void main(String[] args) {

        int amountOfPupils = Utility.readNumber("Введите количество учеников в классе");
        ArrayList<Integer> marks = new ArrayList<Integer>();
        Random random = new Random();
        int maxMark = 0;

        if (amountOfPupils < 0) {
            System.out.println("Ошибка, отрицательное количество учеников");
        } else {
            for (int i = 0; i < amountOfPupils; i++) {
                marks.add(i, random.nextInt(10));
            }
            //просто вывод списка
            for (int i : marks) {
                System.out.print(i + " ");
            }
            System.out.println();

            ListIterator<Integer> iterator = marks.listIterator();

            while (iterator.hasNext()) {
                int temp = iterator.next();
                if (maxMark <= temp) {
                    maxMark = temp;
                    System.out.println(maxMark);

                }
            }

        }
    }
}
