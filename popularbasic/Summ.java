package popularbasic;
public class Summ {
    //Sum of digits of a number
    public static void main(String[] args) {
        int num=23456;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        System.out.println("Sum of digits is: "+sum);
}
}