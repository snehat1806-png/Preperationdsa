import java.util.Scanner;
public class p3 {
    //Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers (0 to stop): ");
        int max = Integer.MIN_VALUE;
        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Largest number: " + max);
        }
        in.close();
    }
}
