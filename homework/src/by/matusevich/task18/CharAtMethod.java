package by.matusevich.task18;

public class CharAtMethod {
    public static void main(String[] args) {
        String str="!asd,asd.asd:asd;asd-asd?" ;
        int n=0;
        char symbol;

        for (int i=0;i<str.length();i++) {
            symbol = str.charAt(i);
            if ((symbol == ',') || (symbol == '.')
                    || (symbol == '?') || (symbol == '!')
                    || (symbol == ':') || (symbol == ';')
                    || (symbol == '-'))
                n++;
        }
        System.out.println(" У нас есть "+n+" знаков препинания");
    }
}
