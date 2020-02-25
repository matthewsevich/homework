package by.matusevich.task9;

class Maximum {
    public static void main(String[] args) {
        int max;
        int newMax = 0;
        int x = (int)(Math.random()*20);
        /*
        System.out.println("Случайное число х = " + x);
        System.out.println("__________");
        */
        while (x != 0){
            max = Math.max(x, 0);
            newMax = Math.max(newMax, max);
            x = (int)(Math.random()*20);
            System.out.println("Текущий максимум " + max);
            System.out.println("Глобальный макимум " + newMax);
            System.out.println("Случайное число х = " + x);
            System.out.println("__________");
        }

        }
    }

