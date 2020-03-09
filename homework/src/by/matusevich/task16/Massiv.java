package by.matusevich.task16;

import by.matusevich.task01.Utility;

public class Massiv {
    public static void main(String[] args) {

        int dim = Utility.readNumber("Введите длину одномерного массива");
        int temp;
        int arr[] = new int[dim];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print("[" + i + "]" + " " + arr[i] + " ");

        }
        System.out.println();
        for (int j = 0; j < arr.length / 2; j++) {

            temp = arr[j];
            arr[j] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print("[" + i + "]" + " " + arr[i] + " ");
        }
    }
}
