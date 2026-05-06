public class HCF {
    public static void main(String[] args) {
        int num1=12;
        int num2=15;
        int hcf=1;
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF of "+num1+" and "+num2+" is "+hcf);
    }
}
