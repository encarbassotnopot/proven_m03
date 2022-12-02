import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Agafa el nom d'un treballador, les hores que fa i el preu per hora.
 * Mostra el nom, el salari net i brut i les taxes.
 * @author eina
 */

public class Ex18 {
	public static void main (String[] args) {
		Scanner lector = new Scanner(System.in);
		String nom;
		int hores, preu;
		try {
			// llegir les hores i el preu de l'hora
			System.out.print("Entra el nom del treballador: ");
			nom = lector.nextLine();
			System.out.print("Entra les hores: ");
			hores = lector.nextInt();
			System.out.print("Entra el preu d'una hora: ");
			preu = lector.nextInt();

			// calcular el salari brut i net
			double salariBrut = Math.min(hores, 35) * preu + Math.max(hores-35, 0) * preu * 1.5;
			double salariNet = Math.min(salariBrut, 500) // els primers 500€ lliures d'impostos
					+ Math.min(Math.max((salariBrut-500), 0), 400) * (1-0.25) // el 2n tram impositiu (d'un 25%) comença passats els 500€ i s'aplica als 400€ següents
					+ Math.max(salariBrut-900, 0) * (1-0.35); // l'últim tram comença un cop superats els 900€, amb un tipus impositiu de 35%
			double taxes = salariBrut - salariNet;

			// mostrar el salari
			System.out.printf("Treballador: %s\n", nom);
			System.out.printf("El salari brut és de %.2f€\n", salariBrut);
			System.out.printf("El salari net és de %.2f€\n", salariNet);
			System.out.printf("Les taxes són de %.2f€\n", taxes);
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}
	}
}
