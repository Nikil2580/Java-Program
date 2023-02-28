import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Another Method :
        // String binaryString = sc.next();
        // int decimal = Integer.parseInt(binaryString, 2);
        // System.out.println(decimal);
        int decimal = sc.nextInt();
        int binary[] = new int[100];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
        sc.close();
    }
}
