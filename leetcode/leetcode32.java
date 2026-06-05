public class leetcode32 {
//https://leetcode.com/problems/fibonacci-number/
public static void main(String[] args){
    int n=10;
    System.out.println(fib(n));
}    
static int fib(int n){
    if(n<=1){
        return n;
    }
    int a=0;
    int b=1;
    for(int i=2;i<=n;i++){
        int c=a+b;
        a=b;
        b=c;
    }
    return b;
    //recursive call
    //return fib(n-1)+fib(n-2);
}
}
