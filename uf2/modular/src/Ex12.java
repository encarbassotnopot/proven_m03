import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana un nombre de kilòmetres i el converteix a milles
 * @author eina
 */
public class Ex12 {
	public static void main(String[] args) {
		boolean correcte = false;
		int km = 0;

		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra els kilòmetres: ");
			km = lector.nextInt();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}

		if (correcte) {
			System.out.printf("%d kilòmetres són %.2f milles\n", km, kmAMilles(km));
		}
	}

	/**
	 * Converteix kilòmetres a milles.
	 * @param km kilòmetres per convertir
	 * @return el resultat de la conversió a milles
	 */
	public static double kmAMilles(int km) {
		final double MILLES_PER_KILOMETRE = 1/1.60934;
		return km * MILLES_PER_KILOMETRE;
	}
}
