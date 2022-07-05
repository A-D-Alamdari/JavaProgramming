import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculation {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scan = new Scanner(System.in);

        int principal;
        while (true) {
            System.out.print("Principal ($1K - $1M): $");
            principal = scan.nextInt();
            if (principal >= 1000 && principal <= 1000000) {
                break;
            }
            System.out.println("Enter a value between 1,000 and 1,000,000.");
        }

        float anualInterest;

        while (true) {
            System.out.print("Annual Interest Rate: %");
            anualInterest = scan.nextFloat();
            if (anualInterest > 0 && anualInterest <= 30) {
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        float monthlyInterest = anualInterest / (PERCENT * MONTHS_IN_YEAR);

        byte years;
        while (true) {
            System.out.print("Period (Years): ");
            years = scan.nextByte();
            if (years >= 1 && years <= 30) {
                break;
            }
            System.out.println("Please enter a value between 1 and 30.");
        }


        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        System.out.println("\nMortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
