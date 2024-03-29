import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana 5 preus i els hi afegeix un 21% d'IVA.
 * @author eina
 */
public class Ex06 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			boolean correcte = false;
			double preuBase = 0;

			Scanner lector = new Scanner(System.in);
			try {
				System.out.print("Entra el preu: ");
				preuBase = lector.nextDouble();
				correcte = true;
			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor.");
				lector.nextLine();
			}

			if (correcte) {
				System.out.printf("%.2f€ amb 21%% d'IVA: %.2f€\n", preuBase, afegeixIVA(preuBase));
			}
		}
	}

	/**
	 * Afegeix un 21% d'IVA a un preu.
	 * @param preu el preu sense IVA
	 * @return el preu amb un 21% d'IVA
	 */
	public static double afegeixIVA(double preu) {
		return preu * 1.21;
	}
}
