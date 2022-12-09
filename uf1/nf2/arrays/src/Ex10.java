
/**
 * Demana a l'usuari el pes d'un nombre de persones.
 * Mostra els valors mínim i màxim, la mitjana i quantes persones superen la mitjana.
 * @author eina
 */
public class Ex10 {
	public static void main(String[] args) {
		int mida = Utils.demanaEnter("Quantes persones vols entrar? ", 1);
		int[] array = Utils.demanaIntArray(mida, "Entra el pes: ");

		int suma = 0;
		int min = array[0];
		int max = array[0];
		int superiorsMitjana = 0;

		for (int element : array) {
			suma += element;
			min = (min < element) ? min : element;
			max = (max > element) ? max : element;
		}
		double mitjana = (double) suma/mida;

		for (int element : array) {
			if (element > mitjana) {
				superiorsMitjana++;
			}
		}

		System.out.println("Mínim: " + min);
		System.out.println("Màxim: " + max);
		System.out.println("Mitjana: " + mitjana);
		System.out.println("Superiors a la mitjana: " + superiorsMitjana);
	}
}
