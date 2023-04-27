import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {

        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            } else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Corresponding Integer of Roman " + str + " is " + romanToInt(str));
        scanner.close();

    }
}