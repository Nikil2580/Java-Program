import java.util.Scanner;

public class AddTwoNumbers {

    static void Add(int n, int m) {
        int sum = n + m;
        printSum(sum);

    }

    static void printSum(int sum) {
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Add(n, m);
        scanner.close();
    }
}