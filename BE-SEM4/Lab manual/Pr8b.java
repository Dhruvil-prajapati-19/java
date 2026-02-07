// -------- Method Overloading --------
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// -------- Method Overriding --------
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Pr8b {
    public static void main(String[] args) {

        // Overloading
        Calculator c = new Calculator();
        System.out.println("Sum (int) = " + c.add(10, 20));
        System.out.println("Sum (double) = " + c.add(5.5, 4.5));

        // Overriding
        Animal a = new Dog();
        a.sound();   // Calls Dog's method
    }
}

// 🔹 Method Overloading (Compile-Time Polymorphism)
// Same method name
// Different number / type / order of parameters
// Occurs in same class
// Return type may differ but parameters must change
// Decided at compile time

// 🔹 Method Overriding (Run-Time Polymorphism)
// Same method name
// Same parameters
// Occurs in different classes (inheritance)
// Parent method is redefined in child class
// Access modifier cannot be more restrictive
// Achieved using @Override annotation
// Decided at run time