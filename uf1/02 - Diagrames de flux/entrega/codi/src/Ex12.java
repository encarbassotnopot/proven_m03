import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix un nombre i retorna si és positiu o negatiu
 * Considerem el 0 com a positiu
 * @author eina
 */

public class Ex12 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int nombre;

		// llegim el nombre
		try {
			System.out.print("Entra un nombre: ");
			nombre = lector.nextInt();

			boolean esPositu = nombre >= 0;


			String missatge;
			if (esPositu) {
				missatge = "El nombre és positiu";
			} else {
				missatge = "El nombre és negatiu";
			}
			System.out.println(missatge);

		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el nombre");
		}
	}
}
