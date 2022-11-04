import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Imprimeix una piràmide del numero de linies indicat per l'usuari
 * feta amb el caràcter que esculli.
 * @author eina
 */
public class Ex14 {
	private static char caracter;

	public static void main(String[] args) {
		boolean correcte = false;
		int num = 0;
		char caracter = ' ';

		// entrada
		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra el número de línies: ");
			num = lector.nextInt();
			System.out.print("Entra el caràcter per fer la piràmide: ");
			caracter = lector.next().charAt(0);
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}

		// operacions i sortida
		if (correcte) {
			dibuixaPiramide(num, caracter);
		}
	}

	/**
	 * Imprimeix la piràmide
	 * @param num el número de la línies de la piràmide
	 * @param caracter el caràcter amb el qual construir la piràmide
	 */
	static void dibuixaPiramide(int num, char caracter) {
		for (int i = 0; i < num; i++) {
			String linea = String.valueOf(caracter).repeat(i*2+1);
			linea = " ".repeat(num-i) + linea;
			System.out.println(linea);
		}
	}
}
