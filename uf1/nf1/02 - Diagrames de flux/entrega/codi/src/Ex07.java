import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix una valor de milles marines,
 * les converteix a metres i mostra el resultat.
 * @author eina
 */

public class Ex07 {
	public static void main(String[] args) {
		final double MILLES_A_METRES = 1852;
		Scanner lector = new Scanner(System.in);
		double milles;
		try {
			// llegir milles
			System.out.print("Entra les milles marines: ");
			milles = lector.nextDouble();

			// fer la conversió a metres
			double metres = milles * MILLES_A_METRES;
			// mostrar el resultat
			System.out.printf("%.2f milles marines són %.0f metres", milles, metres);
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}
	}
}
