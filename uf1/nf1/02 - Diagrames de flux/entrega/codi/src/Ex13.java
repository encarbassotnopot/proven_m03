import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix un nombre i els imprimeix retorna en ordre
 * @author eina
 */

public class Ex13 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int n1;
		int n2;

		// llegim els nombres
		try {
			System.out.print("Entra un nombre: ");
			n1 = lector.nextInt();
			System.out.print("Entra un altre nombre: ");
			n2 = lector.nextInt();

			// compara i genera el missatge amb els nombres ordenats
			String missatge;
			if (n1 >= n2) {
				missatge = n1 + ", " + n2;
			} else {
				missatge = n2 + ", " + n1;
			}

			// mostra el missatge
			System.out.println(missatge);
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el nombre");
		}
	}
}
