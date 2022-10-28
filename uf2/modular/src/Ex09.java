import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana 3 valors i mostra el més gran.
 * @author eina
 */
public class Ex09 {
	public static void main(String[] args) {
		boolean correcte = false;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;

		// entrada
		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra el primer nombre: ");
			n1 = lector.nextInt();
			System.out.print("Entra el segon nombre: ");
			n2 = lector.nextInt();
			System.out.print("Entra el tercer nombre: ");
			n3 = lector.nextInt();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}

		// operacions i sortida
		if (correcte) {
			int major = maxim(n1, n2);
			major = maxim(major, n3);

			System.out.printf("El nombre més gran és %d", major);
		}
	}

	/**
	 * compara dos termes i retorna el major
	 * @param a primer terme
	 * @param b segon terme
	 * @return el terme major
	 */
	static int maxim(int a, int b) {
		return (a > b) ? a : b;
	}
}
