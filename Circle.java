import java.util.Scanner;
public class Circle {
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    double radius = in.nextDouble();
    double circumference = calculateCircumference(radius);
    double area = calculateArea(radius);
    System.out.println("Circumference of the circle is: " + circumference);
    System.out.println("Area of the circle is: " + area);
    in.close();
}
static double calculateCircumference(double radius) {
    return 2 * Math.PI * radius;
}
static double calculateArea(double radius) {
    return Math.PI * Math.pow(radius,2);
}
}