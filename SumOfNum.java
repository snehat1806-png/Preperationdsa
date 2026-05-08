import java.util.Scanner;
public class SumOfNum {
//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero
public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    
    int sumNegative = 0;
    int sumPositiveEven = 0;
    int sumPositiveOdd = 0;

    System.out.println("Enter numbers (enter 0 to terminate): ");
    int num = input.nextInt();

    if (num == 0) {
        System.out.println("No numbers entered. Program terminated.");
    } else {
        while (num != 0) {
            if (num < 0) {
                sumNegative += num;
            } else if (num % 2 == 0) {
                sumPositiveEven += num;
            } else {
                sumPositiveOdd += num;
            }

            num = input.nextInt();
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }

    input.close();
}
}
