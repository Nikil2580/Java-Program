import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner("23"); // Hard Coded
        System.out.println(sc.nextInt());
        sc.close();
    }
}
