import java.util.Scanner;

public class HeronsLaw {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double sideA = input.nextDouble();

        System.out.print("Enter side b: ");
        double sideB = input.nextDouble();

        System.out.print("Enter side c: ");
        double sideC = input.nextDouble();
        input.close();

        double power = sideA * sideA + sideB * sideB - sideC * sideC;
        double area = (Math.sqrt(4 * sideA * sideA * sideB * sideB - power * power)) / 4;

        System.out.println("The area of the given triangle is " + area);
    }
}
