import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println((sc.nextInt()+sc.nextInt()));
        String S = "20";
        int c = Integer.parseInt(S);
        System.out.println(c + 10);
        sc.close();
    }
}
