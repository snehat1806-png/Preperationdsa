public class Nnum {
 //Write a function that returns the sum of first n natural numbers.
 public static void main(String[] args) {
    int n=10;
    sum(n);
 }   
static void sum(int num){
    int sum=0;
    for(int i=1;i<=num;i++){
        sum += i;
    }
    System.out.println("The sum of first "+num+" natural numbers is: "+sum);
}
}
