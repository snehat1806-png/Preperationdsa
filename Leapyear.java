import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year you have to cheeck it is leap year or not");
        int year =sc.nextInt();
        if(year%4==0){
            if(year%100!=0){
                System.out.println(year+ " is a leap year.");  
                
            }
        }
       else if(year%400==0){
            System.out.println(year+" is a leap year.");

        }else{
            System.out.println(year+" is not a leap year.");
        }
     sc.close();
    }
    
}
