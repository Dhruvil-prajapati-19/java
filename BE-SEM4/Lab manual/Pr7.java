import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    // Constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    double getArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class Pr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Rectangle r = new Rectangle(l, b);

        System.out.println("Area of Rectangle = " + r.getArea());
        System.out.println("Perimeter of Rectangle = " + r.getPerimeter());
    }
}
