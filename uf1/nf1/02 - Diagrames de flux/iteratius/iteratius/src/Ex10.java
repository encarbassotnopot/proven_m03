import java.util.Scanner;

/**
 * Llegeix notes (entre 0 i 10) fins que rep un -1. Aleshores i diu si hi havia cap 10
 * @author eina
 */

public class Ex10 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		boolean excelent = false;
		int nota;
		do {
			System.out.print("Introdueix una nota: ");
			nota = lector.nextInt();
			if (nota == 10) {
				excelent = true;
			}
		} while (nota != -1);

		if (excelent) {
			System.out.println("Hi ha algun 10");
		} else {
			System.out.println("Ningú ha tret un 10");
		}
	}
}
