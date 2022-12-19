/**
 * Genera una array de tamany 30 amb enters aleatoris de l'1 al 15, substitueix per 0 els valors entre 7 i 12 i per -1
 * el primer valor més gran de 12. Mostra l'array a cada pas.
 */
public class Emmagatzematge {
	public static void main(String[] args) {
		int[] array = creaEstructura();
		mostraArray(array);
		canviA0(array);
		mostraArray(array);
		canviAMenys1(array);
		mostraArray(array);
	}

	/**
	 * Crea una array de mida 30 i l'omple amb enters aleatoris de l'1 al 15
	 * @return L'array creada
	 */
	static int[] creaEstructura() {
		final int MIDA_ARRAY = 30;
		int[] array = new int[MIDA_ARRAY];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*15) + 1;
		}
		return array;
	}

	/**
	 * Canvia per 0 els valors d'una array entre 7 i 12
	 * @param array L'array
	 */
	static void canviA0(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 7 && array[i] <= 12) {
				array[i] = 0;
			}
		}
	}

	/**
	 * Canvia el primer valor d'una array superior a 12 per un -1
	 * @param array L'array
	 */
	static void canviAMenys1(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 12) {
				array[i] = -1;
				break;
			}
		}
	}

	/**
	 * Mostra els elements d'una array
	 * @param array L'array
	 */
	public static void mostraArray(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i != array.length-1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		System.out.println(sb);
	}
}
