package by.matusevich.task20;

public class LastLetters {
    public static void main(String[] args) {
        String str = "asd,asd. asd :asd;asd-asd?";
        char symbol;

        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if ((symbol == ',') || (symbol == '.')
                    || (symbol == '?') || (symbol == '!')
                    || (symbol == ':') || (symbol == ';')
                    || (symbol == '-') || (symbol == ' ')) {
                if (Character.isLetter(str.charAt(i - 1)))

                    System.out.print(str.charAt(i - 1) + " ");

            }
        }
    }
}
