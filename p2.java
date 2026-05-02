import java.util.Scanner;
public class p2{
    //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter numbers (0 to stop): ");
        int sum = 0;
        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum of all numbers: " + sum);
        in.close();
    }
}