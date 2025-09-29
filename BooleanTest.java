import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter boolean A: ");
        boolean a = input.nextBoolean();
        System.out.print("Enter boolean B: ");
        boolean b = input.nextBoolean();
        System.out.print("Enter boolean C: ");
        boolean c = input.nextBoolean();
        System.out.print("Enter boolean D: ");
        boolean d = input.nextBoolean();
        input.close();

        boolean finaValue = B && !D || !B && !C && D || !A && !B && !C || A && C && !D;

        System.out.println("a is: " + a);
    }
}