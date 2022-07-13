import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int f0 = 0;
        int f1 = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int number = scan.nextInt();
        System.out.println("This program will generate Fibonacci series starting from the first element to element which you entered.\n");

        System.out.print(f0 + " " + f1);
        for (int i = 2; i < number; i++) {
            int f2 = f1 + f0;
            System.out.print(" " + f2);

            f0 = f1;
            f1 = f2;
        }

    }
}
