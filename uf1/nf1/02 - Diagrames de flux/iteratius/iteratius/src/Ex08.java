import java.util.Scanner;

/**
 * Llegeix nombres fins que en troba un de nul i diu quants eren positius i quants negatiu
 * @author eina
 */

public class Ex08 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int positius = 0;
		int negatius = 0;
		int nombre;
		do {
			System.out.print("Introdueix un nombre: ");
			nombre = lector.nextInt();
			if (nombre > 0) {
				positius++;
			} else if (nombre < 0) {
				negatius++;
			}
		} while (nombre != 0);

		if (negatius == 0) {
			System.out.println("No hi havia nombres negatius");
		} else {
			System.out.println("Hi havia nombres negatius");
		}
		System.out.printf("Hi havia %d nombres positius i %d negatius\n", positius, negatius);
	}
}
