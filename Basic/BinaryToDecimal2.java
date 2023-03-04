import java.util.Scanner;

public class BinaryToDecimal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = sc.next();
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println(decimal);
        sc.close();
    }
}