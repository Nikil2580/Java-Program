public class ToString {
    public static void main(String[] args) {
        String str = "Nikil";
        System.out.println(str);

        Name obj = new Name();
        System.out.println(obj.str1);
        System.out.println(obj.str2);
        System.out.println(obj.str3);
        System.out.println(obj.str4);
        System.out.println(obj.str5);

        // Or

        System.out.println(obj);

    }
}

class Name {
    String str1 = "Nikil1";
    String str2 = "Nikil2";
    String str3 = "Nikil3";
    String str4 = "Nikil4";
    String str5 = "Nikil5";

    @Override
    public String toString() {
        return str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
    }
}