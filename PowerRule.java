import java.util.Scanner;

public class PowerRule {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter coefficients of a polynomial's terms on one line: ");
		String[] coefficients = input.nextLine().split(" ");
		System.out.println("Please enter degrees of a polynomial's terms on one line: ");
		String[] degree = input.nextLine().split(" ");
		input.close();

		double[] c = new double[coefficients.length];
		int[] d = new int[degree.length];

		for (int i = 0; i < coefficients.length; i++) {
			c[i] = Double.parseDouble(coefficients[i]);
		}

		for (int i = 0; i < degree.length; i++) {
			d[i] = Integer.parseInt(degree[i]);
		}

		System.out.print("Your first derivative is: f'(x) = ");

		for (int i = 0; i < c.length; i++) {

			double coeffValue = d[i] * c[i];
			int degValue = d[i] - 1;

			if (degValue >= 1) {
				System.out.printf("%+.1fx^%d ", coeffValue, degValue);
			} else if (degValue == 0) {
				System.out.printf("%+.1f ", coeffValue);
			}
		}

		System.out.println();
		System.out.print("Your second derivative is: f''(x) = ");

		for (int i = 0; i < c.length; i++) {

			double coeffValue = d[i] * c[i];
			int degValue = d[i] - 1;

			double coeffValue2 = degValue * coeffValue;
			int degValue2 = degValue - 1;

			if (degValue2 >= 1) {
				System.out.printf("%+.1fx^%d ", coeffValue2, degValue2);
			} else if (degValue2 == 0) {
				System.out.printf("%+.1f ", coeffValue2);
			}
		}
	}
}