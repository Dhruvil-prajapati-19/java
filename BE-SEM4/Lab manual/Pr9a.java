import java.util.Scanner;

public class Pr9a { //exceptionDemo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            System.out.print("Enter another number: ");
            int b = sc.nextInt();

            int result = a / b;   // may cause exception
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed (always runs).");
        }
    }
}
