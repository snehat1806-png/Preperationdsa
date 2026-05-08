import java.util.Scanner;
public class Factoriall {
    //Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// Also, 
// 1! = 1 
// 0!=1
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number to calculate its factorial: ");
    int n = in.nextInt();
    factorial(n);
    in.close();
}
static void factorial(int num){
    int fact=1;
    if(num<0){
        System.out.println("Factorial is not defined for negative numbers.");
}else if(num==0){
    System.out.println("Factorial of 0 is: 1");
}
else{
    for(int i=1;i<=num;i++){
        fact *= i;
    }
    System.out.println("Factorial of "+num+" is: "+fact);
}
}
}
