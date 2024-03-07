import java.util.Scanner;

public class FlatInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter interest rate (in percentage): ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter total amount (loan amount + interest): ");
        double totalAmount = scanner.nextDouble();

        double loanInterest = totalAmount - loanAmount;
        double flatInterestRate = (loanInterest / loanAmount) * 100;

        System.out.println("Flat Interest Rate: " + flatInterestRate + "%");

        scanner.close();
    }
}