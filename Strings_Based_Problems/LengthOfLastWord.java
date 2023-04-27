import java.util.Scanner;

public class LengthOfLastWord {
    public static int length(String str) {
        str = str.trim();
        int count = 0, totLen = str.length();
        int index = str.lastIndexOf(' ', totLen);
        for (int i = index + 1; i < totLen; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Length of last word is " + length(str));
        scanner.close();
    }

}
