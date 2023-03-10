//Factorial

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int number = sc.nextInt();
        int fact = 1;
        while (number != 0) {
            fact = fact * number; // 5
            number--;
        }
        System.out.println("Factorial: " + fact);
        sc.close();
    }
}
