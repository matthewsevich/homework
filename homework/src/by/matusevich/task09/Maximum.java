package by.matusevich.task09;

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
            x = (int) (Math.random() * 20);
            System.out.println("случайное число X = " + x);
        }
        System.out.println("Максимальное число : " + newMax);

        }
    }

