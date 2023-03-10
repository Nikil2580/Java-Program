import java.util.HashMap;

public class FrequencyMap {
    public static void main(String[] args) {
        String str = "Malayalam";
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            m.put(str.charAt(i), m.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println(m);
    }
}
