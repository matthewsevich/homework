package by.matusevich.task26;

import by.matusevich.task01.Utility;

import java.util.ArrayList;
import java.util.Random;

public class Marks {
    public static void main(String[] args) {

        int amountOfPupils = Utility.readNumber("Введите количество учеников в классе");
        ArrayList<Integer> marks = new ArrayList<>();
        Random random = new Random();
        if (amountOfPupils < 0) {
            System.out.println("Ошибка, отрицательное количество учеников");
        } else {
            for (int i = 0; i < amountOfPupils; i++) {
                marks.add(i, random.nextInt(10));
            }
            for (int i : marks) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Удаляем неуды");
            marks.removeIf(integer -> (integer < 4));
            for (int i : marks) {
                System.out.print(i + " ");
            }
        }
    }
}
