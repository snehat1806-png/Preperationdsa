import java.util.Scanner;
public class PalindromeOrNot {
//Write a function to find if a number is a palindrome or not. Take number as parameter.
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number to check if it is a palindrome: ");
    int num=input.nextInt();
    if(isPalindrome(num)){
        System.out.println(num+" is a palindrome.");
    }else{
        System.out.println(num+" is not a palindrome.");
}
input.close();
}
static boolean isPalindrome(int n){
    int originalnum=n;
    int reverse=0;
    while(n>0){
        int digit=n%10;
        reverse=reverse*10+digit;
        n=n/10;
    }
    return originalnum==reverse;
}}
