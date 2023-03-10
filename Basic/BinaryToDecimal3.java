import java.util.Scanner;

public class BinaryToDecimal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useRadix(2);
        int decimal = sc.nextInt();
        System.out.println(decimal);
        sc.close();
    }
}
