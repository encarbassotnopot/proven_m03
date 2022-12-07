import java.util.Arrays;

/**
 * Demana a l'usuari un rang de valors per omplir una array i la mostra.
 * @author eina
 */
public class Ex05 {
	public static void main(String[] args) {
		int min = Utils.demanaEnter("Entra el valor mínim: ");
		int max = Utils.demanaEnter("Entra el valor màxim: ", min);

		int[] array = new int[max-min+1];
		int valor = min;

		for (int i = 0; i < array.length; i++) {
			array[i] = valor++;
		}

		System.out.println(Utils.intArrayToString(array));
	}
}
