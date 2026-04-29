import java.util.Scanner;
public class Greeeting {
    public static void main(String[] args) {
        Scanner take=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=take.nextLine();
        greeting(name);
        take.close();   
    }
    static void greeting(String naam){
        System.out.println( "HAPPY BIRTHDAY " +naam);
    }
}
