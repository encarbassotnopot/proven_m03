
/**
 * Genera una array amb 100 enters aleatoris entre 1 i 10
 * Demana a l'usuari un enter i diu en quines posicions apareix.
 * @author eina
 */
public class Ex08 {
	public static void main(String[] args) {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random()*10)+1;
		}

		int valor = Utils.demanaEnter("Entra el valor a buscar: ");

		System.out.format("El número %d apareix a les posicions:", valor);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				System.out.print(" " + i);
			}
		}
	}
}
