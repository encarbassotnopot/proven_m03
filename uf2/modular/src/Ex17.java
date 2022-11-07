import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana enters fins que s'entra un 0. Diu de cada enter si és o no primer.
 * @author eina
 */
public class Ex17 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		boolean continuar = true;
		do {
			try {
				System.out.print("Entra un nombre: ");
				int entrada = lector.nextInt();

				if (entrada > 0) {
					if (esPrimer(entrada)) {
						System.out.printf("%d és primer\n", entrada);
					} else {
						System.out.printf("%d no és primer\n", entrada);
					}
				} else if (entrada == 0) {
					continuar = false;
				}
				else {
					System.out.println("Has d'entrar un nombre positiu");
				}
			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor");
				lector.nextLine();
			}
		} while (continuar);
	}

	/**
	 * Retorna si un nombre és primer o no
	 * @param nombre el nombre que volem saber si és primer
	 * @return true si és primer, false en cas contrari
	 */
	static boolean esPrimer(int nombre) {
		if (nombre == 1) {
			return false;
		}
		for (int i = 2; i < nombre; i ++) {
			if (nombre % i == 0) {
				return false;
			}
		}
		return true;
	}
}
