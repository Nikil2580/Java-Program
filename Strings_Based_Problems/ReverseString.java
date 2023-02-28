import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            rev = ch + rev;
        }
        System.out.println("Reversed String: " + rev);
        sc.close();
    }
}
