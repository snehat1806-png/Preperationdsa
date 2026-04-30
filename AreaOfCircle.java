import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius=sc.nextDouble();
        areaOfCircle(radius);
        sc.close();
    }
    static void areaOfCircle(double r){
        double area=3.14*r*r;
        System.out.println("Area of circle is: "+area);
    }

}
