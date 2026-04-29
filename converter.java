import java.util.Scanner;
public class converter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter rupees:");
        float rupees=in.nextFloat();
        //1USD=94.75INR
        //94 usd=94*94.75
        //1INR=1/94.75

    double changerupeesintousd=rupees*(1/94.75);
    System.out.println("The indian rupees convert into usa $: "+changerupeesintousd);
        in.close();
    }
}
