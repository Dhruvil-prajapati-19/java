class Student {
    int rollNo;
    String name;
    static String college = "GTU";   // Static variable (shared by all)

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void changeCollege() {    // Static method
        college = "IIT";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        Student.changeCollege(); // calling static method

        Student s1 = new Student(1, "Jay");
        Student s2 = new Student(2, "Rahul");

        s1.display();
        s2.display();
    }
}


// 🔹 Static Variable
// Belongs to class, not object
// Single copy shared among all objects
// Memory allocated only once in class area
// Accessed using ClassName.variableName
// Used for common data (e.g., college name)

// 🔹 Static Method
// Belongs to class, not object
// Can be called using ClassName.methodName()
// Can access only static variables/methods directly
// Cannot use this or super keyword
// Used for utility or common operations