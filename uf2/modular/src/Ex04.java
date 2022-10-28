import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana un número i diu si és positiu, negatiu o zero.
 * @author eina
 */
public class Ex04 {
	public static void main(String[] args) {
		boolean correcte = false;
		int num = 0;

		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra el nombre: ");
			num = lector.nextInt();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}

		if (correcte) {
			switch (signe(num)) {
				case -1:
					System.out.println("El nombre és negatiu");
					break;
				case 0:
					System.out.println("El nombre val 0");
					break;
				case 1:
					System.out.println("El nombre és positiu");
					break;
			}
		}
	}

	/**
	 * Diu el signe del nombre donat.
	 * @param nombre el nombre
	 * @return -1 si és negatiu, 1 si és positiu, 0 si és zero.
	 */
	public static int signe(int nombre) {
		if (nombre < 0) {
			return -1;
		} else if (nombre == 0) {
			return 0;
		} else {
			return 1;
		}
	}
}
