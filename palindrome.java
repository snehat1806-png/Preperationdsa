public class palindrome {
    public static void main(String[] args) {
        int num=12321;
        int originalnum=num;
        int reverse=0;
        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
    if(originalnum==reverse){
        System.out.println("Palindrome number");
    }
    else{
        System.out.println("Not palindrome");
    }
    }
}
