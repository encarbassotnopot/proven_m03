import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Valida si els costats entrats formen un triangle rectangle.
 * @author eina
 */
public class Ex19 {
	public static void main(String[] args) {
		boolean correcte = false;
		int x = 0;
		int y = 0;
		int z = 0;

		// entrada
		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra un catet: ");
			x = lector.nextInt();
			System.out.print("Entra l'altre catet: ");
			y = lector.nextInt();
			System.out.print("Entra la hipotenusa: ");
			z = lector.nextInt();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}

		if (correcte) {
			if (validaPitagores(x, y, z)) {
				System.out.printf("Els costats de %d, %d i %d formen un triangle rectangle\n", x, y, z);
			} else {
				System.out.printf("Els costats de %d, %d i %d no formen un triangle rectangle\n", x, y, z);
			}
		}
	}

	/**
	 * Valida si els costats entrats formen un triangle rectangle amb el teorema de Pitàgores (x²+y²=z²)
	 * @param x Primer catet
	 * @param y Segon catet
	 * @param z Hipotenusa
	 * @return True si el formen, false si no.
	 */
	static boolean validaPitagores(int x, int y, int z) {
		return x*x + y*y == z*z;
	}
}
