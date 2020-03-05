package by.matusevich.task19;

public class WordCount {
    public static void main(String[] args) {
        String first = "  Write a  function,  persistence ,  that takes  in a positive parameter num and returns its multiplicative persistence";
        String str = first + " ";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((Character.isLetter(str.charAt(i))) && !(Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }

        }
        System.out.println("Number of words in sentence is: "+count);

    }
}
