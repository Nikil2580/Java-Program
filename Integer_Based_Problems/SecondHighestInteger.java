import java.util.Scanner;
import java.util.Arrays;

public class SecondHighestInteger {

    public static int getSecondHighest(int[] a) {
        Arrays.sort(a);
        // int largest = a[a.length - 1];
        // int smallest = a[0];
        return a[a.length - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        int secondHigh = getSecondHighest(array);
        System.out.println("Second Highest:" + secondHigh);
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
        // System.out.println("Highest = " + highest + "\nSecond Highest = " + sec_highest);
    }
}
