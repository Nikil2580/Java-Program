import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for (int i = 0; i < N; i++) {
            for (int j = 2 * (N - 1); j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
