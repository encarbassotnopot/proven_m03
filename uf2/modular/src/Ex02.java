import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana l'edat a l'usuari i diu si és major d'edat
 * @author eina
 */
public class Ex02 {
	public static void main(String[] args) {
		boolean correcte = false;
		int edat = 0;

		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra l'edat: ");
			edat = lector.nextInt();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}

		if (correcte) {
			if (esMajorEdat(edat)) {
				System.out.println("Ets major d'edat");
			} else {
				System.out.println("No ets major d'edat");
			}
		}
	}

	/**
	 * Comprova si l'edat donada té la majoria d'edat (18 anys).
	 * @param edat l'edat
	 * @return True si és major d'edat, fals si no.
	 */
	public static boolean esMajorEdat(int edat) {
		return edat >= 18;
	}
}
