import java.util.Scanner;
public class Voting {
    //A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=in.nextInt();
        boolean votingEligibility=iseligible(age);
        if(votingEligibility){
            System.out.println("You are eligible to vote.");    
        }else{
            System.out.println("You are not eligible to vote.");
        }
        in.close();
    }
    static boolean iseligible(int age){
        if(age<0){
            System.out.println("Invalid age. Age cannot be negative.");
            return false;
        }else if(age>=18){
            return true;
    }
        return false;
    }
}
