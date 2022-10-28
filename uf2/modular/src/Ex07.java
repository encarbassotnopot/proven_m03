import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana la base i l'altura d'un rectangle i mostra l'àrea i el perímetre
 * @author eina
 */
public class Ex07 {
	public static void main(String[] args) {
		boolean correcte = false;
		double base = 0;
		double altura = 0;

		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra la base: ");
			base = lector.nextDouble();
			System.out.print("Entra l'altura: ");
			altura = lector.nextDouble();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}

		if (correcte) {
			System.out.printf("Un rectangle de base %.1f i altura %.1f té:" +
					"\n\tun perímetre de %.1f" +
					"\n\tuna àrea de %.1f\n",
					base, altura, perimetreRectangle(base, altura), areaRectangle(base, altura));
		}
	}

	/**
	 * Calcula l'àrea d'un rectangle
	 * @param base la base del rectangle
	 * @param altura l'altura del rectangle
	 * @return l'àrea del rectangle
	 */
	public static double areaRectangle(double base, double altura) {
		return base * altura;
	}
	/**
	 * Calcula el perímetre d'un rectangle
	 * @param base la base del rectangle
	 * @param altura l'altura del rectangle
	 * @return el perímetre del rectangle
	 */
	public static double perimetreRectangle(double base, double altura) {
		return 2*base + 2*altura;
	}
}
