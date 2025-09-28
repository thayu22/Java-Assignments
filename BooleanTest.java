import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter boolean A: ");
        boolean A = input.nextBoolean();
        System.out.print("Enter boolean B: ");
        boolean B = input.nextBoolean();
        System.out.print("Enter boolean C: ");
        boolean C = input.nextBoolean();
        System.out.print("Enter boolean D: ");
        boolean D = input.nextBoolean();
        input.close();

        boolean a = (B && !D) || (!B && !C && D) || (!A && !B && !C) || (A && C && !D);

        System.out.println("a is: " + a);
    }
}