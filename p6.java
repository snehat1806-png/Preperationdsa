import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int sum=0;
        System.out.println("Enter the numbers: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum is: " + sum);
        in.close();
    }
}
