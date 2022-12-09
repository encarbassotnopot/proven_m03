
/**
 * Demana a l'usuari valors el tamany d'una array i un valor per omplir-la.
 * @author eina
 */
public class Ex04 {
	public static void main(String[] args) {
		int mida = Utils.demanaEnter("Quants elements vols a l'array? ", 1);
		int farcit = Utils.demanaEnter("Entra un enter amb el que omplir l'array: ", 1);

		int[] array = new int[mida];
		for (int i = 0; i < array.length; i++) {
			array[i] = farcit;
		}

		System.out.println(Utils.intArrayToString(array));
	}
}
