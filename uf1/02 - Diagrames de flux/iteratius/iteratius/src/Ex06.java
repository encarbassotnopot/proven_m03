import java.util.Scanner;

/**
 * Llegeix 100 nombres no nuls i diu si n'ha llegit cap de negatiu
 * @author eina
 */

public class Ex06 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		boolean negatiu = false;

		for (int i = 0; i < 100; i++) {
			System.out.print("Introdueix un nombre: ");
			int nombre = lector.nextInt();
			if (nombre < 0) {
				negatiu = true;
			}
		}
		if (negatiu) {
			System.out.println("Hi havia un nombre negatiu");
		} else {
			System.out.println("No hi havia cap nombre negatiu");
		}
	}
}
