public class AllSubsets {
    public static void main(String[] args) {

        String str = "FUN";
        int n = str.length();
        int temp = 0;
        String[] arr = new String[n * (n + 1) / 2];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[temp++] = str.substring(i, j + 1);
            }
        }
        System.out.println("All subsets for given string are: ");
        for (String i : arr) {
            System.out.println(i);
        }
    }
}
