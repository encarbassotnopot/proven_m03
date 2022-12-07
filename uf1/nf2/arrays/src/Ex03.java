
/**
 * Demana a l'usuari valors enters per una array.
 * Suma per separat els valors positius i negatius i mostra els resultats.
 * @author eina
 */
public class Ex03 {
	public static void main(String[] args) {
		int mida = Utils.demanaEnter("Quants elements vols a l'array? ", 1);
		int[] array = Utils.demanaIntArray(mida);

		int positius = 0;
		int negatius = 0;

		for (int element : array) {
			if (element > 0) {
				positius += element;
			} else {
				negatius -= element;
			}
		}

		System.out.format("La suma dels positius és %d i la dels negatius %d\n", positius, negatius);
	}
}
