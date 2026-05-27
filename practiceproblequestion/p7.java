package practiceproblequestion;
public class p7 {
    //Calculate Electricity Bill
    public static void main(String[] args) {
        int units=250;
        double bill=0;
        if(units<=100){
            bill=units*0.5;
        }else if(units>100 && units<=200){
            bill=100*0.5+(units-100)*0.75;
        }else if(units>200 && units<=300){
            bill=100*0.5+100*0.75+(units-200)*1.20;
        }else{
            bill=100*0.5+100*0.75+100*1.20+(units-300)*1.50;
        }
        System.out.println("Electricity Bill is: "+bill);
    }
}
