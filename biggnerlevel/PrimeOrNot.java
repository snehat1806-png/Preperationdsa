package biggnerlevel;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=in.nextInt();
        primeornot(num);
        in.close();
    }
    static void primeornot(int n){
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n+" is a prime number.");
        }else{
            System.out.println(n+" is not a prime number.");
        }
    }

}
