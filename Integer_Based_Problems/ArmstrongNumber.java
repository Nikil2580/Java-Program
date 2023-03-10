import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), remainder, result = 0, n = 0;
        sc.close();
        String str = String.valueOf(number);
        n = str.length();

        // for (originalNumber = number; originalNumber != 0; originalNumber /= 10,
        // ++n);

        for (int temp = number; temp != 0; temp /= 10) {
            remainder = temp % 10;
            result += Math.pow(remainder, n);
        }
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
