import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        if (str1.length() != str2.length()) {
            System.out.println("Second string is not a rotation of first string");
        } else {
            str1 = str1.concat(str1);
            if (str1.contains(str2))
                System.out.println("Second string is a rotation of first string");
            else
                System.out.println("Second string is not a rotation of first string");
        }
        scanner.close();
    }
}