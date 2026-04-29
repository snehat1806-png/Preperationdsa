import java.util.Scanner;
public class OddEven {
    public static void main(String []args){
     Scanner input=new Scanner(System.in);
     System.out.print("Enter the number:");
     int num=input.nextInt();
     checkoddeven(num);
     input.close();
    }
    static void checkoddeven(int n){
        if((n%2)==0){
            System.out.println(n+" is an even number");
        }else{
             System.out.println(n+" is a odd number");
        }

    }
}
