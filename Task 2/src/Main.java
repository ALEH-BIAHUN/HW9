import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        сheckNumber();
         }

    public static void сheckNumber() {
        System.out.println("Enter your number");
        int num = new Scanner(System.in).nextInt();
        if (num % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
