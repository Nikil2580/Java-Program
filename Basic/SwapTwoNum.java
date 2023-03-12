import java.util.Arrays;

public class SwapTwoNum {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int[] num = swapNumbers(num1, num2);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    public static int[] swapNumbers(int n1, int n2) {
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;

        // int[] num = new int[] {n1, n2};
        // return num;

        return new int[] { n1, n2 };
    }
}