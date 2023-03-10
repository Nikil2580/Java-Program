import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 23, 435, 1, 0, 6, 86, 279 };
        int num = sc.nextInt();
        sc.close();
        
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        
        while (i <= j) {
            int middle = i + (j - i) / 2; // To avoid array index out of bound we add i
            if (num == arr[middle]) {
                System.out.println("Found");
                return;
            } else if (num > arr[middle]) {
                i = middle + 1;
            } else {
                j = middle - 1;
            }
        }
        
        System.out.println("Not Found");

    }
}
