package by.matusevich.task13;

public class SimpleBreak {
    public static void main(String[] args) {
        int a = (int)(Math.random()*11);
        System.out.println(a);
        boolean number=false;
        if (a<=-2)
            number= false;
        if ((a>=-1)&&(a<=3))
            number= true;
        if (a%2==0)
            number= false;
        for (int i=2; i<a;i++)
        {
            if (a%i==0){
                number= false;
                break;
            } else number= true;
        }
        System.out.println(number);
    }


}