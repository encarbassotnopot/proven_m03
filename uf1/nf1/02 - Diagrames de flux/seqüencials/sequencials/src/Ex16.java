import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix una qualificació numèrica entre 0 i 10
 * imprimeix la qualificació alfabètica equivalent
 * @author eina
 */

public class Ex16 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int nota_num;
		try {
			// llegir la nota
			System.out.print("Entra la nota: ");
			nota_num = lector.nextInt();

			// comprovar que la nota estigui entre 0 i 10
			if (nota_num < 0 || nota_num > 10) {
				System.out.println("La nota ha d'estar entre 0 i 10");
			} else {
				// convertir la nota numèrica a alfabètica
				String nota_alfa;
				if (nota_num <  3) {
					nota_alfa = "Molt deficient";
				} else if (nota_num <  5) {
					nota_alfa = "Insuficient";
				} else if (nota_num <  6) {
					nota_alfa = "Bé";
				} else if (nota_num <  9) {
					nota_alfa = "Notable";
				} else {
					nota_alfa = "Excel·lent";
				}
				System.out.println(nota_alfa);
			}
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}
	}
}
