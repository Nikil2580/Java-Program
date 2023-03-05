public class MaximumMinimumChar {
    public static void main(String[] args) {
        String str = "aaaabbbbbccddd";
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        int max = Integer.MIN_VALUE;
        char maxCh = str.charAt(0);
        int min = Integer.MAX_VALUE;
        char minCh = str.charAt(0);
        for (int i = 0; i < 256; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxCh = (char) i;
            }
            if (min > arr[i] && arr[i] > 0) {
                min = arr[i];
                minCh = (char) i;
            }
        }
        System.out.println("Maximum Repeated Character is: " + maxCh);
        System.out.println("Minimum Repeated Character is: " + minCh);
    }
}
