package by.matusevich.task26;

import by.matusevich.task01.Utility;

import java.util.ArrayList;
import java.util.Random;

public class Marks {
    public static void main(String[] args) {

        int amountOfPupils = Utility.readNumber("Введите количество учеников в классе");
        ArrayList<Integer> marks = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amountOfPupils; i++) {
            marks.add(i, random.nextInt(10));
        }
        for (int i : marks) {
            System.out.println(i);
        }
        System.out.println("удаляем неуды");
        marks.removeIf(integer -> (integer < 4));
        for (int i : marks) {
            System.out.println(i);
        }
    }
}
