public class LabeledForExample {
    public static void main(String[] args) {
        // Using Label for outer and for loop
        aa: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
        int i = 0;
        aaa: while (i < 3) {
            System.out.println(i);
            if (i == 2) {
                break aaa;
            }
        }
    }
}