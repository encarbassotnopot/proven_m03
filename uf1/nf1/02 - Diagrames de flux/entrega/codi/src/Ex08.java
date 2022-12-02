import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana l'edat a l'usuari i imprmeix
 * si és o no major d'edat.
 * @author eina
 */

public class Ex08 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int edat = 0;
		try {
			// llegir edat
			System.out.print("Entra l'edat: ");
			edat = lector.nextInt();

			String missatge;
			if (edat >= 0) {
				if (edat >= 18) {
					missatge = "Ets major d'edat";
				} else {
					missatge = "Ets menor d'edat";
				}
			} else {
				missatge = "Edat no vàlida";
			}
			System.out.println(missatge);
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}
	}
}
