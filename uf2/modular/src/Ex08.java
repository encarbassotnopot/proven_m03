import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mostra el sumatori, productori i la mediana per un rang entre 1 i un número entrat per l'usuari
 * @author eina
 */
public class Ex08 {
	public static void main(String[] args) {
		boolean correcte = false;
		int limit = 0;

		// entrada i validació
		Scanner lector = new Scanner(System.in);
		try	{
			System.out.print("Entra el límit: ");
			limit = lector.nextInt();
			if (limit >= 1) {
				correcte = true;
			} else {
				System.out.println("El límit no pot ser menor de 1");
			}
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}

		// operacions i sortida
		if (correcte) {
			System.out.printf("Pels rang entre 1 i %d: " +
					"\n\tsumatori: %d" +
					"\n\tproductori: %d" +
					"\n\tmediana %.1f\n",
					limit, sumatori(limit), productori(limit), mediana(limit));
		}
	}

	/**
	 * Calcula el sumatori entre 1 i el límit
	 * @param limit el límit
	 * @return sumatori d'1 a limit
	 */
	static int sumatori(int limit) {
		int sumatori = 0;
		for (int i = 1; i <= limit; i++) {
			sumatori += i;
		}
		return sumatori;
	}

	/**
	 * Calcula el productori entre 1 i el límit
	 * @param limit el límit
	 * @return productori d'1 a limit
	 */
	static int productori(int limit) {
		int productori = 1;
		for (int i = 1; i <= limit; i++) {
			productori *= i;
		}
		return productori;
	}

	/**
	 * Calcula la mediana del rang entre 1 i el límit
	 * @param limit el límit
	 * @return la mediana
	 */
	static double mediana(int limit) {
		return (1+limit)/2.0;
	}
}
