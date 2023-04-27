public class AddDigits {
    public static int addDigits(int num) {
        int sum = 0;
        if (num < 10)
            return num;
        else {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigits(11));
    }
}
