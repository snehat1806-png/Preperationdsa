public class armstrong {
    public static void main(String[] args) {
        int num=153;
        int originalnum=num;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        if(sum==originalnum){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }

}
