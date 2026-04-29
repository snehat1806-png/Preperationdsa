import java.util.Scanner;
public class largetnum {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the 1st num");
     int n1=in.nextInt();
      System.out.println("Enter the 2nd num");
     int n2=in.nextInt();
     if(n1>n2){
        System.out.println(n1 +" is largest number");
     }else{
         System.out.println(n2 +" is largest number");
     }
     in.close();
    }
}
