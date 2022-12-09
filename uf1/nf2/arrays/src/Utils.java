import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	/**
	 * mostra un missatge a l'usuari i li demana un enter
	 * @param missatge el missatge que s'ha de mostrar a l'usuari
	 * @return l'enter entrat per l'usuari
	 */
	public static int demanaEnter(String missatge) {
		return demanaEnter(missatge, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/**
	 * mostra un missatge a l'usuari i li demana un enter amb un valor mínim
	 * @param missatge el missatge que s'ha de mostrar a l'usuari
	 * @param minim    el valor minim que l'usuari pot entrar (inclòs)
	 * @return l'enter entrat per l'usuari
	 */
	public static int demanaEnter(String missatge, int minim) {
		return demanaEnter(missatge, minim, Integer.MAX_VALUE);
	}

	/**
	 * mostra un missatge a l'usuari i li demana un enter en un rang
	 * @param missatge el missatge que s'ha de mostrar a l'usuari
	 * @param minim    el valor minim que l'usuari pot entrar (inclòs)
	 * @param maxim    el valor màxim que l'usuari pot entrar (inclòs)
	 * @return l'enter entrat per l'usuari
	 */
	public static int demanaEnter(String missatge, int minim, int maxim) {
		boolean enterValid = false;
		int enter = 0;
		do {
			Scanner lector = new Scanner(System.in);
			System.out.print(missatge);
			try {
				enter = lector.nextInt();
				if (enter < minim) {
					System.out.println("El valor mínim és " + minim);
				} else if (enter > maxim) {
					System.out.println("El valor mínim és " + maxim);
				} else {
					enterValid = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor.");
			}
		} while (!enterValid);
		return enter;
	}

	/**
	 * Demana enters a l'usuari per omplir una array
	 * @param mida la mida de l'array
	 * @return l'array plena
	 */
	public static int[] demanaIntArray(int mida) {
		return demanaIntArray(mida, "Entra un enter: ");
	}

	/**
	 * Demana enters a l'usuari per omplir una array
	 * @param mida la mida de l'array
	 * @param missatge el missatge que cal mostrar a l'usuari
	 * @return l'array plena
	 */
	public static int[] demanaIntArray(int mida, String missatge) {
		int[] array = new int[mida];

		for (int i = 0; i < mida; i++) {
			array[i] = demanaEnter(missatge);
		}

		return array;
	}

	public static String intArrayToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i != array.length-1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
