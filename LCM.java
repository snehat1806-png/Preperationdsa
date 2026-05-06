public class LCM {
    //find lcm of number
/*    public static void main(String[] args) {
        int num1=12;
        int num2=16;
       
        int hcf=1;
        for(int i=1;i<=num1&&i<=num2;i++){
            if(num1%i==0&&num2%i==0){
                hcf=i;
            }

        }
        int lcm=(num1*num2)/hcf;
        System.out.println(lcm+" is a lcm of "+num1+" and "+num2);
    }
    */
    //can do like that 
    public static void main(String[] args) {
        int num1=12;
        int num2=16;
        int hcf= hcf(num1,num2);
        int lcm=lcm(num1,num2,hcf(num1,num2));
        System.out.println(hcf+" is hcf");
        System.out.println(lcm+" is lcm");
    }
    static int hcf(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int lcm(int a,int b,int hcf){
        return (a*b)/hcf;
    }
}
