package by.matusevich.task17;

import by.matusevich.task01.Utility;

public class MatrixBadCode {
    public static void main(String[] args) {
        int dim = Utility.readNumber("Введите размер двумерного массива");
        int m[][] = new int[dim][dim];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = 1;

            }

        }
        for (int i = 0; i < m.length / 2 + 1; i++) { //левый верхний угол
            for (int j = 0; j < i; j++) {
                m[i][j] = 0;
            }

        }
        for (int i = m.length - 2; i >= m.length / 2 + 1; i--) { //левый нижний угол
            for (int j = 0; j < m.length - i - 1; j++) {
                m[i][j] = 0;
            }

        }
        for (int i = m.length - 1; i > m.length / 2 - 1; i--) { //правая нижняя сторона
            for (int j = m.length - 1; j > i; j--) {
                m[i][j] = 0;
            }

        }
        for (int i = 0; i <= m.length / 2 - 1; i++) { //правая верхняя сторона
            for (int j = m.length - 1; j > m.length - i - 1; j--) {
                m[i][j] = 0;
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