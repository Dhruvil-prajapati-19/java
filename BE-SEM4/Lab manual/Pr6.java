import java.util.Scanner;

public class Pr6 {

    // I. Method With argument and with return value
    static int add1(int a, int b) {
        return a + b;
    }

    // II. Method Without argument and without return value
    static void add2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum (Type II) = " + (a + b));
    }

    // III. Method Without argument and with return value
    static int add3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;
    }

    // IV. Method With argument and without return value
    static void add4(int a, int b) {
        System.out.println("Sum (Type IV) = " + (a + b));
    }

    public static void main(String[] args) {  // main Method
        Scanner sc = new Scanner(System.in);

        // Type I
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum (Type I) = " + add1(x, y));

        // Type II
        add2();

        // Type III
        int result = add3();
        System.out.println("Sum (Type III) = " + result);

        // Type IV
        System.out.print("Enter two numbers: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        add4(m, n);
    }
}
