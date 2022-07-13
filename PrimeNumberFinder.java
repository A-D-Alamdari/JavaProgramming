import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        int flag = 0;
        System.out.println("This program find out the number that you will enter is prime number or not.");

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your number: ");
        int number = scan.nextInt();

        if (number == 1 || number == 0) {
            System.out.println(number + " is not prime number!");
        } else {
            for (int i = 2; i < (number / 2); i++) {
                if (number % i == 0) {
                    System.out.println(number + " is NOT prime number!");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println(number + " is a prime number.");
        }
    }
}
