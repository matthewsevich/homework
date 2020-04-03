package by.matusevich.task32;

import java.io.*;

public class BinaryPrint {
    public static void main(String[] args) throws IOException {
        DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("hello.dat")));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }
        for (int i = 0; i < 20; i++) {
            a.writeInt(i);
        }
        a.close();
    }
}
