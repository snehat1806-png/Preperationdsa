import java.util.Scanner;
public class PandC {
    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=in.nextInt();
        System.out.println("Enter the time rate:");
        int time=in.nextInt();
        
         combinationandpermutation(num,time);
           in.close(); 
    }
  static void combinationandpermutation(int n,int r){
    int permutation=factorial(n)/factorial(n-r);
    int combination=factorial(n)/(factorial(r)*factorial(n-r));
    System.out.println("Permutation is: "+permutation);
    System.out.println("Combination is: "+combination);
  }
    static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }
        return fact;
    }
    

}
