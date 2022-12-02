import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix 3 nombres, imprimeix el més gran
 * @author eina
 */

public class Ex15 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int n1, n2, n3;
		try {
			// llegir números
			System.out.print("Entra el primer número: ");
			n1 = lector.nextInt();
			System.out.print("Entra el segon número: ");
			n2 = lector.nextInt();
			System.out.print("Entra el tercer número: ");
			n3 = lector.nextInt();

			// triar el més gran
			int major;
			if (n1 > n2) {
				major = n1;
			} else {
				major = n2;
			}
			if (major < n3) {
				major = n3;
			}

			// imprimir el més gran
			System.out.println("El nombre més gran és: " + major);
		} catch (InputMismatchException e) {
			System.out.println("No s'han pogut llegir els valors");
		}
	}
}
