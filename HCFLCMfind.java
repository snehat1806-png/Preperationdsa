public class HCFLCMfind {
    public static void main(String[] args) {
        int num1=12,num2=15;
        int hcf=findHCF(num1,num2);
        int lcm=findLCM(num1,num2,hcf);
        System.out.println("HCF of "+num1+" and "+num2+" is: "+hcf);//HCF is about to find smallest digit
        System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);//LCM is about to find largest one 
    }
    static int findHCF(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int findLCM(int a,int b,int hcf){
        return (a*b)/hcf;
    }   
    
}
