public class SwapTwoNumbers {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println(A + "\n" + B);
    }
}
