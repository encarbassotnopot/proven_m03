import java.util.Arrays;

/**
 * Genera una array amb 100 enters aleatoris entre 0 i 1000
 * Demana a l'usuari un enter i diu quants elements són menors que aquesta xifra.
 * @author eina
 */
public class Ex06 {
	public static void main(String[] args) {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random()*1001);
		}

		int limit = Utils.demanaEnter("Entra el valor: ");
		int menors = 0;
		for (int element : array) {
			if (element < limit) {
				menors++;
			}
		}

		System.out.format("%d elements de l'array són menors de %d", menors, limit);
	}
}
