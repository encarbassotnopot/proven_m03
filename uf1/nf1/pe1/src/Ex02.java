import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mostra una taula de conversió de temperatures Celsius a Farenheit
 * en el rang que introdueixi l'usuari.
 * 24/10/2022
 * @author Eina Coma Bages
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		try {
			// pregunta dades a l'ususari i entrada
			System.out.print("Introdueix la temperatura mínima: ");
			int tMin = lector.nextInt();
			System.out.print("Introdueix la temperatura màxima: ");
			int tMax = lector.nextInt();

			// verificació de dades i capçalera
			if (tMin > tMax) {
				System.out.println("La temperatura mínima és més gran que la màxima! No es mostrarà res.");
			} else {
				System.out.println("Graus Celsius\tGraus Farenheit");
			}

			// impressió de la taula.
			while (tMin <= tMax) {
				double farenheit = 9.0 / 5.0 * tMin + 32;
				System.out.printf("%.1fºC\t\t\t%.1fºF\n", (double) tMin, farenheit);
				tMin++;
			}
		}
		catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}
	}
}
