import java.util.Scanner;

public class NewtonMethod {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        willContinue: while (true) {
            System.out.print("Enter initial guess: ");
            double n = input.nextDouble();
            double newGuess = 0;

            while (true) {
                double function = 6 * Math.pow(n, 4) - 13 * Math.pow(n, 3) - 18 * Math.pow(n, 2) + 7 * n + 6;
                double derivative = 24 * Math.pow(n, 3) - 39 * Math.pow(n, 2) - 36 * n + 7;
                newGuess = n - function / derivative;

                if (Math.abs(n - newGuess) > 0.0000000001) {
                    System.out.println(newGuess);
                    n = newGuess;
                    continue;
                } else {
                    System.out.println("The root is " + newGuess);
                    System.out.print("Do you want to try again: ");
                    boolean ask = input.nextBoolean();
                    if (ask == false) {
                        input.close();
                        break willContinue;
                    }
                }
            }
        }
    }
}