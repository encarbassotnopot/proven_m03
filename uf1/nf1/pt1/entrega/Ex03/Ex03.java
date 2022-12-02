import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Pregunta els membres dels grups i quants menors hi ha.
 * Calcula el preu, aplicant els descomptes pertinents, i el mostra
 * amb la informació del grup.
 * @author eina
 */
public class Ex03 {
	public static void main(String[] args) {
		final int PREU_ADULT = 20;
		final int PREU_MENOR = 10;

		Scanner lector = new Scanner(System.in);
		try {
			// preguntem de quantes persones és el grup
			// ens assegurem que no sigui negatiu ni estigui buit
			int grup = 0;
			boolean grupValid = false;
			do {
				System.out.print("De quantes persones és el grup? ");
				grup = lector.nextInt();
				if (grup < 0) {
					System.out.println("No hi pot haver un nombre negatiu de persones al grup.");
				} else if (grup == 0) {
					System.out.println("No hi pot haver un grup buit.");
				} else {
					grupValid = true;
				}
			} while (!grupValid);


			// preguntem quants menors hi ha al grup
			// ens assegurem que no hi hagi més menors que persones ni que sigui negatiu
			int menors = 0;
			boolean menorsValids = false;
			do {
				System.out.print("Quants menors hi ha? ");
				menors = lector.nextInt();
				if (menors < 0) {
					System.out.println("No hi pot haver un nombre negatiu de menors al grup.");
				} else if (menors > grup) {
					System.out.println("No hi poden haver més menors que persones al grup.");
				} else {
					menorsValids = true;
				}
			} while (!menorsValids);

			int adults = grup - menors;

			double preu = adults * PREU_ADULT + menors * PREU_MENOR;

			// descompte per grups de més de 25 persones
			if (grup > 25) {
				if (adults > 0) {
					// descomptem el preu de l'entrada adulta, si hi ha adults
					preu -= PREU_ADULT;
				} else {
					// si no, descomptem el preu de l'entrada infantil
					preu -= PREU_MENOR;
				}
			}

			// descompte per grups de més de 10 persones
			if (grup > 10) {
				// apliquem un 25% de descompte
				preu *= (1 - 0.25);
			}

			System.out.printf("%d adults, %d menors. Preu a pagar %.2f euros", adults, menors, preu);

		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}
	}
}
