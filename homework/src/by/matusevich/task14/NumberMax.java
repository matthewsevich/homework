package by.matusevich.task14;

import by.matusevich.task02.WeekConverter;

import java.util.Random;

public class NumberMax {
    public static void main(String[] args) {
        int input = WeekConverter.readNumber("Введите количество учеников");
        int marks[] = new int[input];
        Random random = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(10);
            marks[i]++; //оценки от 1 до 10
            System.out.println("[" + i + "]" + " " + marks[i]);
        }
        int maxMark = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                //System.out.println("number of max mark");
                //System.out.println(maxMark);

            }
        }

        for (int i = 0; i < marks.length; i++) {
            if (maxMark == marks[i]) {
                System.out.print("Number of max mark = ");
                System.out.println(i);
            }
        }
        System.out.println("Maxmark = " + maxMark);
    }
}
