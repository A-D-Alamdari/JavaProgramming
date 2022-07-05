import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to FizzBuzz Game.");
        System.out.println("If you want to EXIT the game please enter \"EXIT\".");
        System.out.println("Please Enter a Positive Whole Number: ");

        while (true) {
            String number = scan.nextLine();

            if (number.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else {
                int num = Integer.parseInt(number);
                if (num <= 0) {
                    System.out.println("You entered a Negative number.");
                    System.out.println("We take the Absolute value of it, and continue with it");
                    num = Math.abs(num);
                }

                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.print("\tFizzBuzz\n");
                } else if (num % 3 == 0) {
                    System.out.print("\tFizz\n");
                } else if (num % 5 == 0) {
                    System.out.print("\tBuzz\n");
                } else {
                    System.out.println("\t" + num + "\n");
                }
            }
        }
    }
}
