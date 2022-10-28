import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana un nombre de milles i mostra la conversió a kilòmetres
 * @author eina
 */
public class Ex05 {
	public static void main(String[] args) {
		boolean correcte = false;
		int milles = 0;

		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra les milles: ");
			milles = lector.nextInt();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}

		if (correcte) {
			System.out.printf("%d milles són %.2f km\n", milles, millesAKilometres(milles));
		}
	}

	/**
	 * Converteix les milles entrades a KM.
	 * @param milles les milles
	 * @return les milles en kilometres
	 */
	public static double millesAKilometres(int milles) {
		final double KILOMETRES_PER_MILLA = 1.60934;
		return milles * KILOMETRES_PER_MILLA;
	}
}
