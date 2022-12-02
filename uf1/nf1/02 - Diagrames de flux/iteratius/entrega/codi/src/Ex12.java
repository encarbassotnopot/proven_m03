import java.util.Scanner;

/**
 * Calcula la potència entrada per l'usuari
 * @author eina
 */

public class Ex12 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		System.out.print("Introdueix la base: ");
		int base = lector.nextInt();
		System.out.print("Introdueix l'exponent: ");
		int exponent = lector.nextInt();

		int resultat = 1;

		for (int i = 1; i <= exponent; i++) {
			resultat *= base;
		}

		System.out.printf("%d^%d=%d\n", base, exponent, resultat);
	}
}
