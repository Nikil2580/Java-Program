package File_Handling;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // FileReader reader = new FileReader("D:\\Files\\VS
            // Code\\Java-Program\\File_Handling\\art.txt");
            // int data = reader.read();
            // while (data != -1) {
            // System.out.print((char) data);
            // data = reader.read();
            // }
            // reader.close();

            Scanner scanner = new Scanner(new File("D:\\Files\\VS Code\\Java-Program\\File_Handling\\art.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
