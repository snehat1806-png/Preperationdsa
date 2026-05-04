import java.util.Scanner;
//Calculate Average Of N Numbers
public class p5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        float sum=0;
        System.out.println("Enter the numbers: ");
        int[] arr = new int[n];
    
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        float avg = (float) sum / n;
        System.out.println("Average is: " + avg);
        
        in.close();
    }
}
