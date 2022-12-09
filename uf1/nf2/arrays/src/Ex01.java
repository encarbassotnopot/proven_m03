
/**
 * Demana a l'usuari valors enters per una array.
 * Mostra l'array, la mida, la suma, el producte, la mitjana i els valors mínim i màxim.
 * @author eina
 */
public class Ex01 {
	public static void main(String[] args) {
		int mida = Utils.demanaEnter("Quants elements vols a l'array? ", 1);
		int[] array = Utils.demanaIntArray(mida);

		int suma = 0;
		int producte = 1;
		int min = array[0];
		int max = array[0];

		for (int element : array) {
			suma += element;
			producte *= element;
			min = (min < element) ? min : element;
			max = (max > element) ? max : element;
		}
		double mitjana = (double) suma/mida;

		System.out.println(Utils.intArrayToString(array));
		System.out.println("Mida: " + mida);
		System.out.println("Suma: " + suma);
		System.out.println("Producte: " + producte);
		System.out.println("Mínim: " + min);
		System.out.println("Màxim: " + max);
		System.out.println("Mitjana: " + mitjana);
	}
}
