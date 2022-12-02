/**
 * Calcula (i mostra) la suma i el producte dels números compresos entre 1 i 10
 * @author eina
 */

public class Ex11 {
	public static void main(String[] args) {
		int parells = 0;
		int imparells = 1;

		for (int i = 100; i <= 200; i++) {
			if (i %2 == 0) {
				parells += i;
			} else {
				imparells += i;
			}
		}
		System.out.printf("La suma dels nombres parells compresos entre 100 i 200 és %d i la dels imparells %d\n", parells, imparells);
	}
}
