package popularbasic;
import java.util.Scanner;
public class PerfectN {
    //Perfect number is a number that is equal to the sum of its positive divisors excluding itself.Example :6 because 1+2+3=6 amd 5 is not a perfect number because 1 is the only divisor of 5 and 1 is not equal to 5. 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect number or not: ");
        int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<n;i++){
        if(n%i==0){
            sum+=i;
        }
    }    if(sum==n){
        System.out.println(n+" is a perfect number.");
    }else{
        System.out.println(n+" is not a perfect number.");
    }
    sc.close();
}

}