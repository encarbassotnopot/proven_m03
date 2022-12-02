import java.util.Scanner;

/**
 *  Demana el nom a l'usuari i el saluda.
 * @author eina
 */

public class Ex01_v2 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String nom = lector.next();
		System.out.print("Hello, " + nom);
	}
}
