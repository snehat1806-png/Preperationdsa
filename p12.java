public class p12 {
    //Calculate Depreciation of Value
    public static void main(String[] args) {
        double initialValue=10000;
        double depreciationRate=0.1; //10% depreciation
        double depreciatedValue=initialValue*(1-depreciationRate);
        //Depreciation is calculated by multiplying the initial value with (1 - depreciation rate).
        //In this case, the depreciated value will be 10000 * (1 - 0.1) = 9000.
        //The depreciated value is then printed to the console.
        System.out.println("Depreciated Value is: "+depreciatedValue);
    }
}
