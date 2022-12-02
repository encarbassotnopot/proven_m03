import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix el preu d'un article i el preu de venda real,
 * calcula el descompte aplicat i mostra el percentatge.
 * @author eina
 */

public class Ex06 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		double pArt;
		double pReal;
		try {
			// llegir el preu de l'article
			System.out.print("Entra el preu de l'article: ");
			pArt = lector.nextDouble();

			if (pArt == 0) {
				System.out.println("El preu de l'article no pot ser zero");
				System.exit(1);
			}

			// llegir el preu de venda
			System.out.print("Entra el preu de venda real: ");
			pReal = lector.nextDouble();

			// calcular descompte aplicat en percentatge
			double descompte = (1 - pReal / pArt) * 100;
			// mostrar el resultat
			System.out.printf("El descompte aplicat és de %.2f%%", descompte);
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}
	}
}
