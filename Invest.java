public class Invest{
    //Future Investment Value
    public static void main(String[] args) {
        //Future Investment Value=Investment Amount* (1+Monthly Interest Rate)^Number of Months
        double InvestmentAmount=1000;
        double AnnualInterestRate=5;
        double MonthlyInterestRate=AnnualInterestRate/1200;
        int NumberOfMonths=5;
        double FutureInvestmentValue=InvestmentAmount*Math.pow(1+MonthlyInterestRate,NumberOfMonths);
        System.out.println("Future Investment Value is "+FutureInvestmentValue);
    }
}