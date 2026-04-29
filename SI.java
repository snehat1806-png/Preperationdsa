import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the principal value:" );
        float principal=input.nextFloat();
        System.out.println("Enter the rate value:" );
        float rate=input.nextFloat();
        System.out.println("Enter the time value in year:" );
        float time=input.nextFloat();
        System.out.print("The simple interest is:");
        float simpleinterest=(principal*rate*time)/100;
        System.out.println(simpleinterest);
        input.close();
    }
}
