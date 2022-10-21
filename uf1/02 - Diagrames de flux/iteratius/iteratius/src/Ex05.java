import java.util.Scanner;

/**
 * Calcula el factorial d'un nombre
 * @author eina
 */

public class Ex05 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		System.out.print("Introdueix el nombre: ");
		int max = lector.nextInt();
		int resultat = 1;

		for (int i = 2; i <= max; i++) {
			resultat *= i;
		}

		System.out.printf("El resultat de %d! és %d\n", max, resultat);
	}
}
