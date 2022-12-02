import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Pregunta a l'usuari la taula de multiplicar d'un número entre 1 i 9.
 * Alerta a l'usuari en cas d'errada i en acabar la taula, mostra el total d'errades.
 * 24/10/2022
 * @author Eina Coma Bages
 */
public class Ex03 {
	public static void main(String[] args) {
		// escollim aleatòriament la taula a preguntar
		int taula = (int) (Math.random() * 9) + 1;
		System.out.println("Taula de multiplicar del número: " + taula);

		Scanner lector = new Scanner(System.in);
		int errades = 0;

		for (int i = 1; i <= 10; i++) {
			// preguntem a l'usuari
			System.out.printf("%dx%d=", taula, i);

			try {
				// llegim la resposta
				int resposta = lector.nextInt();
				// si és errònia l'avisem i incrementem les errades
				if (resposta != taula*i) {
					System.out.printf("Incorrecte! %dx%d és igual a %d\n", taula, i, taula*i);
					errades++;
				}
			} catch (InputMismatchException e) {
				// si no la podem llegir (no és un enter) ho comptem com un error i seguim
				System.out.printf("No s'ha pogut llegir el valor. %dx%d és igual a %d\n", taula, i, taula*i);
				lector.nextLine(); // netegem el buffer del lector
				errades++;
			}
		}
		System.out.printf("Has tingut %d errades.\n", errades);
	}
}
