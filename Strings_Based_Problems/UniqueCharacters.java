public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "Malayalam";
        int[] hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
            if (hash[str.charAt(i)] == 1) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
