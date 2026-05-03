public class CI {
    public static void main(String[] args) {
        double principal = 1000; // Initial amount
        double rate = 5; // Annual interest rate in percentage
        int time = 3; // Time in years
        int n = 4; // Number of times interest is compounded per year

        // Calculate compound interest
        double amount = principal * Math.pow(1 + (rate / 100), n*time);
        double compoundInterest = amount - principal;

        System.out.printf("The compound interest is: %.2f\n", compoundInterest);
        
    }
}
