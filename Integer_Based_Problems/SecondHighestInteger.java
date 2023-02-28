import java.util.Scanner;
import java.util.Arrays;

public class SecondHighestInteger {

    public static void getSecondHighest(int[] a) {
        Arrays.sort(a);
        int size = a.length;
        System.out.println("Highest = " + a[size - 1]);
        System.out.println("Second Highest = " + a[size - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        // int highest = array[0];
        // int sec_highest = array[1];
        // for(int i=1; i<N; i++){
        // if(array[i] > highest){
        // sec_highest = highest;
        // highest = array[i];
        // }
        // else if(array[i] > sec_highest){
        // sec_highest = array[i];
        // }
        // }
        // System.out.println("Highest = " + highest + "\nSecond Highest = " +
        // sec_highest);
        getSecondHighest(array);
    }
}
