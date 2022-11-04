import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea una array del tamany escollit per l'usuari i l'omple amb valors aleatoris.
 * @author eina
 */
public class Ex16 {
	public static void main(String[] args) {
		boolean correcte = false;
		int tamany = 0;
		double[] array;

		// entrada
		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra un número: ");
			tamany = lector.nextInt();
			if (tamany < 0) {
				System.out.println("El valor ha de ser positiu");
			} else {
				correcte = true;
			}
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}

		if (correcte) {
			array = new double[tamany];
		}
	}

	/**
	 * Omple una array amb valors aleatoris
	 * @param array l'arrray
	 */
	static void ompleArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random();
		}
	}
}
