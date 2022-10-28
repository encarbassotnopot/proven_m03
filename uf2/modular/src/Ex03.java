import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana dos números enters a l'usuari i mostra el més petit
 * @author eina
 */
public class Ex03 {
	public static void main(String[] args) {
		boolean correcte = false;
		int n1 = 0;
		int n2 = 0;

		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra el primer nombre: ");
			n1 = lector.nextInt();
			System.out.print("Entra el segon nombre: ");
			n2 = lector.nextInt();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}

		if (correcte) {
			System.out.printf("El valor més petit és %d.\n", menor(n1, n2));
		}
	}

	/**
	 * Compara els paràmetre i retorna el més petit
	 * @param a primer nombre
	 * @param b segon nombre
	 * @return el paràmetre més petit
	 */
	public static int menor(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}
}
