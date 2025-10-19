import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a polynomial in the form f(x)=3x^3-5x^2+1x^4+9x^6+3.1x^1+2");
        String polynomial = input.nextLine().substring(5);
        System.out.println("Please enter the value of x: ");
        double x = input.nextDouble();
        StringTokenizer strng = new StringTokenizer(polynomial, "+-^x");

        while (strng.hasMoreTokens()) {
            double answer = (Double.parseDouble(strng.nextToken()) * Math.pow(x, Double.parseDouble(strng.nextToken())))
                    - (Double.parseDouble(strng.nextToken()) * Math.pow(x, Double.parseDouble(strng.nextToken())))
                    + (Double.parseDouble(strng.nextToken()) * Math.pow(x, Double.parseDouble(strng.nextToken())))
                    + (Double.parseDouble(strng.nextToken()) * Math.pow(x, Double.parseDouble(strng.nextToken())))
                    + (Double.parseDouble(strng.nextToken()) * Math.pow(x, Double.parseDouble(strng.nextToken())))
                    + Double.parseDouble(strng.nextToken());
            System.out.println("The result is: " + answer);
            break;
        }
        input.close();
    }
}