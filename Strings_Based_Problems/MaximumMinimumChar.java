public class MaximumMinimumChar {
    public static void main(String[] args) {
        String str = "malayalam";
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        int max = 0;
        char maxCh = str.charAt(0);
        int min = 1;
        char minCh = str.charAt(0);
        for (int i = 0; i < 256; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxCh = (char) i;
            } else if (min > arr[i]) {
                min = arr[i];
                minCh = (char) i;
            }
        }
        System.out.println("Maximum Repeated Character is: " + maxCh);
        System.out.println("Minimum Repeated Character is: " + minCh);
    }
}
