public class EqualTo {
    public static void main(String[] args) {
        String name = "Anil";
        String anotherName = new String("Anil");

        System.out.println(name == anotherName); // false

        System.out.println(name.equals(anotherName)); // true

        String thirdName = "Anil";

        System.out.println(name == thirdName); // true

    }
}
