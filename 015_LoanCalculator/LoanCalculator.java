import java.util.Scanner;
public class LoanCalculator{
    public static void main(String []args){
        //5.0double principalBalance;
       //double annualInterestRate;
        //int remainingMonth;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your principal balance:");
        double principalBalance = scan.nextDouble();
        // scanthe next double
        System.out.println("Enter your annual Interest rate:");
        double annualInterestRate = scan.nextDouble();
        System.out.println("Enter your remaining months");
        int remainingMonth = scan.nextInt();
        double monthlyInterest = principalBalance*(annualInterestRate/remainingMonth);
        double monthlyPayment = principalBalance/remainingMonth + monthlyInterest;
        System.out.println(" Your   monthly Interest is: "+ monthlyInterest+ " and your monthly payment is "+ monthlyPayment);
        scan.close();
}
}