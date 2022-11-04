import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calcula el descompte aplicat en un producte
 * @author eina
 */
public class Ex13 {
	public static void main(String[] args) {
		boolean correcte = false;
		double preuOriginal = 0;
		double preuPagat = 0;

		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra quant valia originalment: ");
			preuOriginal = lector.nextDouble();
			System.out.print("Entra quant has pagat: ");
			preuPagat = lector.nextDouble();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}

		if (correcte) {
			if (preuOriginal < preuPagat) {
				System.out.println("No t'han aplicat cap descompte");
			} else {
				System.out.printf("El descompte aplicat és de %.2f%%\n", calculDescompte(preuOriginal, preuPagat));
			}
		}
	}

	/**
	 * Calcula el descompte aplicat.
	 * @param preuBase preu original
	 * @param preuPagat preu amb descompte
	 * @return el percentatge de descompte
	 */
	public static double calculDescompte(double preuBase, double preuPagat) {
		double diferencia = preuBase - preuPagat;
		System.out.println(diferencia);
		return diferencia * 100 / preuBase;
	}
}
