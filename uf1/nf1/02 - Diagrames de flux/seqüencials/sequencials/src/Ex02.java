import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix el costat d'un quadrat
 * i en calcula i n'imprimeix l'àrea.
 * @author eina
 */

public class Ex02 {
	public static void main(String[] args) {
		System.out.print("Entra el costat del quadrat: ");
		Scanner lector = new Scanner(System.in);
		try {
			// llegeir el costat
			double costat = lector.nextDouble();
			// calcular l'àrea
			double area = costat * costat;
			// imprimir resultat
			System.out.format("El quadrat de costat %.2f té una àrea de %.2f\n", costat, area);
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}}
}
