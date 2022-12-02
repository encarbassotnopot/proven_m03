import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix dos números i mostra el més gran
 * @author eina
 */
public class Ex11 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in); // creem scanner
		double n1;
		double n2;

		try {
			// llegim els valors
			System.out.print("Entri el primer número: ");
			n1 = lector.nextDouble();
			System.out.print("Entri el segon número: ");
			n2 = lector.nextDouble();

			// efectuem la comparació
			String missatge;
			if (n1 > n2) {
				missatge = "El nombre més gran és " + n1;
			} else if (n2 > n1) {
				missatge = "El nombre més gran és " + n2;
			} else {
				missatge = "Tots dos nombre són iguals, amb valor de " + n2;
			}

			// imprimim el més gran
			System.out.println(missatge);

		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}
	}
}