package by.matusevich.task32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class PrintRead {

    public static void main(String[] args) {

        writeFile("myData.txt");
        readFile("myData.txt");
    }

    private static void writeFile(String filename) {
        DataOutputStream output;
        try {
            output = new DataOutputStream(new FileOutputStream(filename));
            Random rn = new Random();
            for (int i = 0; i < 20; i++) {
                int k = rn.nextInt(10);
                System.out.print(k + " ");
                output.writeInt(k);
            }
            output.flush();
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFile(String filename) {
        DataInputStream input;
        try {
            input = new DataInputStream(new FileInputStream(filename));
            int number;
            int sum = 0;
            int count = 0;
            System.out.println();
            while (input.available() > 0) {
                number = input.readInt();
                sum += number;
                count++;
                System.out.print(number + " ");
            }
            System.out.println();
            System.out.println("srednee " + sum / count);
            System.out.println(count);

            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}