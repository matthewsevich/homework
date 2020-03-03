package by.matusevich;

public class Bla {
    public static void main(String[] args) {
        int n=0;
        char symbol;

        String str="bla-bla-bla";
        System.out.println(str.length());
        for (int i=0;i<5;i++)
        {
            str+=str;
        }
        System.out.println(str.length());
        for (int i=0;i<str.length();i++) {
            symbol = str.charAt(i);
            if (symbol == '-')
                n++;
        }
        System.out.println(n);
}}
