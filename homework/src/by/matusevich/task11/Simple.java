package by.matusevich.task11;

public class Simple {
    public static void main(String[] args) {
        int x = (int)(Math.random()*11111);
        System.out.println(Prime(x));
        System.out.println(x);
    }
        static boolean Prime(int a)
        {
        if (a<=-2)
            return false;
        if ((a>=-1)&&(a<=3))
            return true;
        if (a%2==0)
            return false;
        for (int i=3; i<a/2;i++)
            if (a%i==0)
                return false;
            return true;
        }


}

