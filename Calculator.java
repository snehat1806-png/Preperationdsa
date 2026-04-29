import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ans=0;
        System.out.println("Enter the operation which have to proceed:");
        char ch=input.next().trim().charAt(0);
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'){
            System.out.println("Enter 1st numbers:");
            int num1=input.nextInt();
            System.out.println("Enter 2nd numbers:");
            int num2=input.nextInt();
            if(ch=='+'){
              ans=num1+num2;
            }
            if(ch=='-'){
                ans=num1-num2;
              
            }
            if(ch=='*'){
                ans=num1*num2;
               
            }
            if(ch=='/'&& num2>0){
                ans=num1/num2;
            }
             if(ch=='%'&& num2>0){
                ans=num1%num2;
            }
        }
        else{
            System.out.println("Invalid choice !Thankyouu");
        }
        System.out.println("The answer is:");
        System.out.println(ans);
        input.close();
    }
}
