
import java.util.Scanner;

public class j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfPayments = numberOfYears * 12;

        double emi = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        System.out.printf("The EMI for the loan is: %.2f%n", emi);
    }
}