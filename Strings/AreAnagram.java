import java.util.Scanner;

public class AreAnagram {

    static int NO_OF_CHARS = 256;
    
    static boolean areAnagram(char[] str1,char[] str2)
    {
        int[] count = new int[NO_OF_CHARS];

        if (str1.length != str2.length)
            return false;

        for(int i = 0; i < str1.length; i++)
        {
            count[str1[i]]++;
            count[str2[i]]--;
        }

        for(int i = 0; i < NO_OF_CHARS; i++){
            if (count[i] != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str1[] = sc.next().toCharArray();
        char str2[] = sc.next().toCharArray();
        sc.close();
        if (areAnagram(str1, str2))
            System.out.println("The two strings are " + "anagram of each other");
        else
            System.out.println("The two strings are " + "not anagram of each other");
    }
}