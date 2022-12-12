import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mostra la distància que recorre una granota de joguina.
 * Amb el primer salt avança 30cm, i cada salt que fa és un 2% més curt que l'anterior
 */
public class Ex02 {

	public static void main(String[] args) {
		double DISTANCIA_INICIAL = 30;
		int salts = demanaSalts();
		double distancia = calculaDistancia(salts, DISTANCIA_INICIAL);
		System.out.printf("Després de fer %d salts, la granota ha avançat %.3f cm\n", salts, distancia);
	}

	/**
	 * Calcula la distància que recorre la granota de joguina
	 * @param salts     els salts que ha de fer
	 * @param distancia la distància que ha avançat en l'últim salt (en cm)
	 * @return la distància que avança (en cm)
	 */
	static double calculaDistancia(int salts, double distancia) {
		if (salts == 0 || distancia == 0) {
			// si la distància que ha avançat és 0, per molts salts que li quedin per fer no avançarà més i podem retornar
			return 0;
		}
		return distancia + calculaDistancia(--salts, distancia * 0.98);
	}

	static int demanaSalts() {
		boolean saltsValids = false;
		int salts = 0;
		do {
			try {
				Scanner lector = new Scanner(System.in);
				System.out.print("Entra el nombre de salts: ");
				salts = lector.nextInt();

				if (salts < 0) {
					System.out.println("Has d'entrar un nombre positiu de salts.");
				} else {
					saltsValids = true;
				}

			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor.");
			}

		} while (!saltsValids);
		return salts;
	}
}