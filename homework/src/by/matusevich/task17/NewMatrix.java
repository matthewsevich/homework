package by.matusevich.task17;

import by.matusevich.task01.Utility;

public class NewMatrix {
    public static void main(String[] args) {

        int N = Utility.readNumber("Введите размерность массива");
        int m[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            int from, to;
            if (i < N / 2) {
                from = i;
                to = N - i;
            } else {
                from = N - i - 1;
                to = i + 1;
            }
            for (int j = 0; j < N; j++) {
                if (j >= from && j < to) {
                    m[i][j] = 1;
                }
            }
        }


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}