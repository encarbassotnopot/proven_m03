import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana un número i n'imprimeix la taula de multiplicar
 * @author eina
 */
public class Ex11 {
	public static void main(String[] args) {
		boolean correcte = false;
		int num = 0;

		// entrada
		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra un número: ");
			num = lector.nextInt();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}

		// operacions i sortida
		if (correcte) {
			mostraTaula(num);
		}
	}

	/**
	 * Imprimeix la taula de multiplicar d'un número
	 * @param num el número de la taula
	 */
	static void mostraTaula(int num) {
		for (int i = 0; i <= 10; i ++) {
			System.out.printf("%dx%d=%d\n", num, i, num*i);
		}
	}
}
