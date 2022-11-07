/**
 * Imprimeix les taules de multiplicar de l'1 al 10
 * @author eina
 */
public class Ex20 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Taula del %d:\n", i);
			mostraTaula(i);
		}
	}

	/**
	 * Imprimeix la taula de multiplicar d'un número
	 * @param num el número de la taula
	 */
	static void mostraTaula(int num) {
		for (int i = 0; i <= 10; i ++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
}
