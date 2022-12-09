
/**
 * Genera una array amb enters de l'1 i 100 i la copia en ordre invers.
 * Finalment mostra ambdues arrays.
 * @author eina
 */
public class Ex09 {
	public static void main(String[] args) {
		int[] array = new int[100];
		int[] arrayInversa = new int[100];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		for (int i = 0; i < arrayInversa.length; i++) {
			arrayInversa[i] = array[99-i];
		}

		System.out.println(Utils.intArrayToString(array));
		System.out.println(Utils.intArrayToString(arrayInversa));
	}
}
