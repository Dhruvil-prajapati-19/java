import java.util.Scanner;

class Pr3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}

// // Method for scanner class

// nextInt()	integer (10, 25)
// nextDouble()	decimal numbers (10.5)
// nextFloat()	float values
// nextLong()	long integer
// next()	reads one word only
// nextLine()	reads full sentence
// nextBoolean()	true/false