import java.util.Scanner;

public class AmbiguousCase {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Angle A: ");
        double angleA = input.nextDouble();
        System.out.print("Enter side a: ");
        double sideA = input.nextDouble();
        System.out.print("Enter side b: ");
        double sideB = input.nextDouble();
        input.close();

        double height = sideB * Math.sin(Math.toRadians(angleA));

        if (angleA < 90) {
            System.out.println("The angle is acute angle!");
            if (sideA < height) {
                System.out.println("This is not a triangle!");
            } else if (sideA == height) {
                System.out.println("This is a right angle triangle.");
            } else if (sideA > sideB) {
                System.out.println("There is one triangle.");
            } else if (height < sideA && sideA < sideB) {
                System.out.println("There are two triangles(ambiguous case)");
            } 
        } if (angleA > 90 && angleA < 180) {
            System.out.println("The angle is obtuse angle!");
            if (sideA < sideB || sideA == sideB) {
                System.out.println("This is not a triangle!");
            } else {
                System.out.println("There is one triangle!");
            }
        }
    }
}