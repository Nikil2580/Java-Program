public class RemoveWhiteSpace {
    public static void main(String[] arg) {
        String str1 = "Remove white spaces";
        str1 = str1.replaceAll(" ", "");
        System.out.println("String after removing all the white spaces : " + str1);
    }
}
