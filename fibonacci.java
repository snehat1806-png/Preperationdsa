import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the index till find out the fibonachi number");
        int n=in.nextInt();
        fibonaccinum(n);
      
        in.close();
        
    }
    static void fibonaccinum(int c){
        int previous=0;
        int current=1;
        for(int i=2;i<=c;i++){
            int temp=current;
            current=previous+current;
            previous=temp;

        }
        System.out.println(current);
     
    }
   
}
