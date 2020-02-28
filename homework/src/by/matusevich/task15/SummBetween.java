package by.matusevich.task15;

import java.util.Random;

public class SummBetween {
    public static void main(String[] args) {

        int marks[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(10);
            marks[i]++; //оценки от 1 до 10
            System.out.println("[" + i + "]" + " " + marks[i]);
        }
        int summ=0;
        int minNumber=0;
        int maxNumber=0;
        int maxMark = marks[0];
        int minMark = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                maxNumber = i;
            }
            if (minMark > marks[i]) {
                minMark = marks[i];
                minNumber = i;
            }
        }
        if (minNumber<maxNumber){
            for (int i=minNumber;i<maxNumber-1;i++)
                summ+=marks[i+1];
        } else if (minNumber>maxNumber){
            for (int i=maxNumber;i<minNumber-1;i++)
            summ+=marks[i+1];


        }
        System.out.println(summ);

        for (int i = 0; i < marks.length; i++) { //вывод минимальног и максимальных значений
            if (maxMark == marks[i]) {
                System.out.print("Number of max mark =");
                System.out.println(i);
            }
        }
        System.out.println("Maxmark = " + maxMark);
        for (int i = 0; i < marks.length; i++) {
            if (minMark == marks[i]) {
                System.out.print("Number of min mark =");
                System.out.println(i);
            }
        }
        System.out.println("minmark = " + minMark);
    }
}

        /*for (int i=0;i<summarray.length;i++){ //сортировка
            for (int j=0;j<summarray.length-1;j++){
                if (summarray[j]>summarray[j+1]) {
                    temp=summarray[j];
                    summarray[j]=summarray[j+1];
                    summarray[j+1]=temp;
                }
            }
        }
        for (int i=0;i<summarray.length;i++){
            System.out.print(summarray[i]+" ");
        }*/ // конец сортировки
