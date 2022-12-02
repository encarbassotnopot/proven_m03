import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana si és laborable, dissabte o festiu,
 * el tipus d'esmorzar i en mostra el preu.
 * 24/10/2022
 * @author Eina Coma Bages
 */
public class Ex01 {
	public static void main(String[] args) {
		// constants dels preus
		final double ESMORZAR_LABORABLE_1 = 2.00;
		final double ESMORZAR_LABORABLE_2 = 2.50;
		final double ESMORZAR_DISSABTE_1 = 2.20;
		final double ESMORZAR_DISSABTE_2 = 2.70;
		final double ESMORZAR_FESTIU_1 = 2.30;
		final double ESMORZAR_FESTIU_2 = 2.80;

		Scanner lector = new Scanner(System.in);
		try {
			// pregunta i entrada dia
			System.out.print("Introdueix dia ([L]aborable, Di[S]sabte o [F]estiu): ");
			char dia = lector.next().charAt(0);

			// verificació dia
			if (dia != 'L' && dia != 'S' && dia != 'F') {
				System.out.println("Opció incorrecta");
			} else {
				// pregunta i entrada tipus esmorzar
				System.out.print("Introdueix tipus d'esmorzar (1 o 2): ");
				int tipus = lector.nextInt();

				// verificació tipus esmorzar
				if (tipus != 1 && tipus != 2) {
					System.out.println("Opció incorrecta");
				} else {
					// mostrar preu en funció dels paràmetres
					double preu = 0.0;

					switch (dia) {
						case 'L':
							preu = (tipus==1) ? ESMORZAR_LABORABLE_1 : ESMORZAR_LABORABLE_2;
							break;
						case 'S':
							preu = (tipus==1) ? ESMORZAR_DISSABTE_1 : ESMORZAR_DISSABTE_2;
							break;
						case 'F':
							preu = (tipus==1) ? ESMORZAR_FESTIU_1 : ESMORZAR_FESTIU_2;
							break;
					}
					System.out.printf("El preu de l'esmorzar és de %.2f€\n", preu);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}
	}
}

