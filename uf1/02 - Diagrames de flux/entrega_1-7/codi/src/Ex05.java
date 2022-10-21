import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix un radi en calcula i mostra
 * el perímetre i l'àrea de la circumferència i el volum de l'esfera.
 * @author eina
 */

public class Ex05 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		double radi;
		try {
			// llegir el radi
			System.out.print("Entra el radi: ");
			radi = lector.nextDouble();
			// calcular i mostrar el perímetre de la circumferència
			double perimetre = 2 * Math.PI * radi;
			System.out.println("La circumferència de radi " + radi + " té un perímetre de " + perimetre);

			// calcular i mostrar l'àrea de la circumferència
			double area = Math.PI * Math.pow(radi, 2);
			System.out.println("La circumferència de radi " + radi + " té una àrea de " + area);

			// calcular i mostrar el volum de l'esfera
			double volum = 4.0/3.0 * Math.PI * Math.pow(radi, 3);
			System.out.println("L'esfera de radi " + radi + " té un volum de " + volum);
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}
	}
}
