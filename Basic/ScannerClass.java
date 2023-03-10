import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner("23");
        System.out.println(sc.nextInt());

        sc = new Scanner("25"); // Hard Coded Value
        System.out.println(sc.nextInt());
    }
}
