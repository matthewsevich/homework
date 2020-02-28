package by.matusevich.task16;

import java.util.Random;

public class Massiv {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = new int[10];
        //Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print("[" + i + "]" + " " + arr[i]+" ");

        }
        System.out.println();
            for (int j = 0; j < arr.length/2; j++) {

                temp = arr[j];
                arr[j] = arr[arr.length-1-j];
                arr[arr.length-1-j] = temp;
            }
        for (int i = 0; i < arr.length; i++) {

            System.out.print("[" + i + "]" + " " + arr[i]+" ");
        }
    }
}
