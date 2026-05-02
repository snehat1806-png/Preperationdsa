// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class Leetcode1 {
    public static void main(String[] args) {
        int n=234;
        int result=subtractProductAndSum(n);
        System.out.println(result);
    }
    
    public static int subtractProductAndSum(int n) {
         int sum=0;
     int product=1;
     int result=0;
     while(n>0){
        int digit=n%10;
        sum=sum+digit;
        product=product*digit;
        n=n/10;
     }
    result=(product-sum);
    return result;
        
    }
}
