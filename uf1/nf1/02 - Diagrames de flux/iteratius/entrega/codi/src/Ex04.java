import java.util.Scanner;

/**
 * Mostra els números de l'1 fins al que introdueixi l'usuari
 * @author eina
 */

public class Ex04 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		System.out.print("Introdueix el número màxim: ");
		int max = lector.nextInt();

		for (int i = 1; i <= max; i++) {
			System.out.println(i);
		}
	}
}
