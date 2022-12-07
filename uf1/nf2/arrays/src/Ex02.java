
/**
 * Demana a l'usuari valors enters per una array.
 * Suma per separat els valors parells i senars i mostra els resultats.
 * @author eina
 */
public class Ex02 {
	public static void main(String[] args) {
		int mida = Utils.demanaEnter("Quants elements vols a l'array? ", 1);
		int[] array = Utils.demanaIntArray(mida);

		int parells = 0;
		int senars = 0;

		for (int element : array) {
			if (element % 2 == 0) {
				parells += element;
			} else {
				senars += element;
			}
		}

		System.out.format("La suma dels parells és %d i la dels senars %d\n", parells, senars);
	}
}
