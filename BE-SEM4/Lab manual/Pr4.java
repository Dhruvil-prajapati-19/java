import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
