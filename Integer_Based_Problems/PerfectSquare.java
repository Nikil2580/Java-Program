import java.util.*;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        sc.close();
        double sqrt = Math.sqrt(number);
        System.out.println(sqrt);
        System.out.println(Math.floor(sqrt));

        if (sqrt - Math.floor(sqrt) == 0) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a perfect square");
        }

    }
}

// for (int i=1; i*i<=number; i++){
// if(number/i==i){
// System.out.println("Perfect Square");
// return;
// }
// }
// System.out.println("Not a Perfect Square");
