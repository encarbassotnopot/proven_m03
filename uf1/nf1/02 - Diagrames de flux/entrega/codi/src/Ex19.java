import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Agafa la quantitat que s'ha de pagar i la quantitat pagada.
 * Mostra el que falta per pagar o el que s'ha de tornar
 * @author eina
 */

public class Ex19 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int aPagar, pagats;
		try {
			System.out.print("Entra la quantitat pagada:");
			pagats = lector.nextInt();
			System.out.print("Entra la quantitat per pagar:");
			aPagar = lector.nextInt();

			int diferencia = Math.abs(pagats - aPagar);

			if (diferencia != 0) {
				if (pagats > aPagar) {
					System.out.printf("Cal retornar %d€\n", diferencia);
				} else {
					System.out.printf("Falten %d€\n", diferencia);
				}
			} else {
				System.out.println("Quantitat exacta");
			}
			} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}
	}
}
