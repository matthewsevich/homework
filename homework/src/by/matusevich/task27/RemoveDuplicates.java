package by.matusevich.task27;

import by.matusevich.task01.Utility;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int input = Utility.readNumber("Размер коллекции");
        int collectionBound = Utility.readNumber("Введите диапазон коллекции");
        ArrayList<Integer> collection = new ArrayList<>();
        Random random = new Random();
        if (input < 0) {
            System.out.println("Ошибка, отрицательное число");
        } else {
            for (int i = 0; i < input; i++) {
                collection.add(i, random.nextInt(collectionBound));
            }
            for (int i : collection) {
                System.out.print(i + " ");
            }
            System.out.println();//для большой коллекции
            System.out.println("удаляем дупликаты");

            Set<Integer> set = new LinkedHashSet<>(collection);
            collection.clear();
            collection.addAll(set);
            for (int i : collection) {
                System.out.print(i + " ");
            }
        }
    }
}