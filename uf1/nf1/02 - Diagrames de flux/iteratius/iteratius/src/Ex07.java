import java.util.Scanner;

/**
 * Llegeix 100 nombres no nuls i diu quants eren positius i quants negatiu
 * @author eina
 */

public class Ex07 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int positius = 0;
		int negatius = 0;

		for (int i = 0; i < 100; i++) {
			System.out.print("Introdueix un nombre: ");
			int nombre = lector.nextInt();
			if (nombre > 0) {
				positius++;
			} else {
				negatius++;
			}
		}

		System.out.printf("Hi havia %d nombres positius i %d negatius\n", positius, negatius);
	}
}
