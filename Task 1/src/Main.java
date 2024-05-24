import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {

        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void divide() {
        double divide = a / b;
        System.out.println("The divide of the numbers is: " + divide);
    }

    private static void diff() {
        double diff = a - b;
        System.out.println("The subtraction of the numbers is: " + diff);
    }

    private static void multiply() {
        double multiply = a * b;
        System.out.println("The multiply of the numbers is: " + multiply);
    }

    private static void sum() {
        double sum = a + b;
        System.out.println("The sum of the numbers is: " + sum);
    }

    private static double inputDouble() {
        System.out.println("Enter number: ");
        return new Scanner(System.in).nextDouble();
    }
}