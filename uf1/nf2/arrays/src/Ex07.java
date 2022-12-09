
/**
 * Demana a l'usuari i genera un array amb un nombre d'elements, increment i element inicial
 * @author eina
 */
public class Ex07 {
	public static void main(String[] args) {
		int mida = Utils.demanaEnter("Entra el nombre d'elements: ", 0);
		int increment = Utils.demanaEnter("Entra l'increment: ");
		int valor = Utils.demanaEnter("Entra el valor inicial: ");

		int[] array = new int[mida];

		for (int i = 0; i < array.length; i++) {
			array[i] = valor;
			valor += increment;
		}

		System.out.println(Utils.intArrayToString(array));
	}
}
