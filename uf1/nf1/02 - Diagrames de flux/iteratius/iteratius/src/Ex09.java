/**
 * Calcula (i mostra) la suma i el producte dels números compresos entre 1 i 10
 * @author eina
 */

public class Ex09 {
	public static void main(String[] args) {
		int suma = 0;
		int producte = 1;

		for (int i = 1; i <= 10; i++) {
			suma += i;
			producte *= i;
		}

		System.out.printf("La suma dels nombres entre 1 i 10 és %d i el producte %d\n", suma, producte);
	}
}
