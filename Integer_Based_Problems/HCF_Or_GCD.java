import java.util.Scanner;

public class HCF_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();
        while(number1!=number2){
            if(number1 > number2){
                number1 = number1 - number2;
            }
            else{
                number2 = number2 - number1;
            }
        }
        System.out.println("HCF or GCD is " + number1);
    }
}
