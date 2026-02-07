// Abstract Class
abstract class Shape {
    abstract void draw();   // abstract method

    void message() {        // normal method
        System.out.println("This is a shape");
    }
}

// Interface
interface Color {
    void fillColor();
}

// Child class implementing both
class Circle extends Shape implements Color {
    void draw() {
        System.out.println("Drawing Circle");
    }

    public void fillColor() {
        System.out.println("Coloring Circle");
    }
}

public class Pr8c {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.message();
        c.draw();
        c.fillColor();
    }
}


// 🔹 Abstraction
// Hides implementation details
// Shows only essential features
// Achieved using abstract class and interface

// 🔹 Abstract Class
// Declared using abstract keyword
// Can have abstract + normal methods
// Can have constructors and variables
// Cannot create object directly
// Used when classes share common base

// 🔹 Interface
// Used to achieve 100% abstraction
// All methods are public and abstract (by default)
// Variables are public, static, final
// Supports multiple inheritance
// Implemented using implements keyword