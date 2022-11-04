import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calcula la suma de tots els elements i la mitjana d'una array amb els primers 100 nombres naturals.
 * @author eina
 */
public class Ex15 {
	public static void main(String[] args) {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		System.out.printf("La suma dels primers 100 nombres naturals és %d i la mitjana %.1f",
				sumaArray(array), mitjanaArray(array));
	}

	/**
	 * Calcula la suma dels valors d'una array
	 * @param array l'arrray
	 * @return la suma dels valors
	 */
	static int sumaArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}

	/**
	 * Calcula la mitjana d'una array
	 * @param array l'arrray
	 * @return la mitjana
	 */
	static double mitjanaArray(int[] array) {
		return (double) sumaArray(array)/array.length;
	}
}
