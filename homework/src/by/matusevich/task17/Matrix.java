package by.matusevich.task17;

public class Matrix {
    public static void main(String[] args) {
        int m[][] = new int[11][11];
        int k=0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = 1;
                //System.out.print(m[i][j] + " ");

                System.out.print("[" + i + "][" + j + "]=" + m[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < m.length/2+1; i++) { //левый верхний угол
            for (int j = 0; j < i; j++) {
                m[i][j] = 0;
                System.out.print("[" + i + "][" + j + "]=" + m[i][j] + " ");
            }
            System.out.println();

        }        System.out.println();
        for (int i =m.length-2; i >= m.length/2+1; i--) { //левый нижний угол
            for (int j = 0; j < m.length-i-1; j++) {
                m[i][j] = 0;
                System.out.print("[" + i + "][" + j + "]=" + m[i][j] + " ");
            }
            System.out.println();

        }        System.out.println();
        for (int i = m.length-1; i > m.length/2-1; i--) { //правая нижняя сторона
            for (int j = m.length-1; j > i; j--) {
                m[i][j] = 0;
                System.out.print("[" + i + "][" + j + "]=" + m[i][j] + " ");
            }
            System.out.println();

        }        System.out.println();
        for (int i = 0; i <= m.length/2-1; i++) { //правая верхняя сторона
            for (int j = m.length-1; j > m.length-i-1; j--) {
                m[i][j] = 0;
                System.out.print("[" + i + "][" + j + "]=" + m[i][j] + " ");
            }
            System.out.println();

        }        System.out.println();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        /*int mass[][]=new int[5][];
        for (int i=0;i<mass.length;i++){
            mass[i]=new int[i+1];
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = 1;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
    }*/
    }
}
