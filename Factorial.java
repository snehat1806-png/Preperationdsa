// This program calculates the factorial of a given number using a for loop.
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = input.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by i
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
        input.close();
    }
}
