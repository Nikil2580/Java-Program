public class PalindromeString {
    public static void main(String[] args) {
        String string = "Kayak";
        string = string.toLowerCase();

        for (int i = 0, j = string.length() - 1; i < string.length() / 2; i++, j--) {
            if (string.charAt(i) != string.charAt(j)) {
                System.out.print("Given string is not a palindrome");
                System.exit(0); //return;
            }
        }
        System.out.print("Given string is palindrome");

    }
}
