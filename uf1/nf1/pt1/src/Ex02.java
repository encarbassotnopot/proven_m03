import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana un número, diu si és parell o senar. Si és parell també diu si és divisible entre 3.
 * @author eina
 */

public class Ex02 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.print("Entra un nombre: ");
		try {
			int nombre = lector.nextInt();
			if (nombre % 2 == 0) {
				// és parell, comprovem si és divisible per 3
				if (nombre % 3 == 0) {
					System.out.println("número parell i divisible entre 3");
				} else {
					System.out.println("número parell i no divisible entre 3");
				}
			} else {
				// és senar
				System.out.println("número senar");
			}
		} catch (InputMismatchException e) {
			System.out.println("N0 s'ha pogut llegir el valor.");
		}
	}
}
