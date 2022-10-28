import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana dos números reals a l'usuari i els multiplica
 * @author eina
 */
public class Ex01 {
	public static void main(String[] args) {
		boolean correcte = false;
		double n1 = 0;
		double n2 = 0;

		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra el primer número: ");
			n1 = lector.nextDouble();
			System.out.print("Entra el segon número: ");
			n2 = lector.nextDouble();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'han pogut llegir els valors");
		}

		if (correcte) {
			System.out.printf("%.1f x %.1f = %.1f\n", n1, n2, multiplica(n1, n2));
		}
	}

	/**
	 * Multiplica els arguments.
	 * @param a primer nombre
	 * @param b segon nombre
	 * @return el producte d'a i b
	 */
	public static double multiplica(double a, double b) {
		return a * b;
	}
}
