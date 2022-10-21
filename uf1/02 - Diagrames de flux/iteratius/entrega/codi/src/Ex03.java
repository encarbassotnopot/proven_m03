/**
 * Mostra els números parells de l'1 al 200
 * @author eina
 */

public class Ex03 {
	public static void main(String[] args) {
		for (int i = 1; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
