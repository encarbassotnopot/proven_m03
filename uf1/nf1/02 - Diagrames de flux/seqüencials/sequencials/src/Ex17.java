import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int hores, minuts, segons;

		try {
			System.out.print("Entra les hores: ");
			hores = lector.nextInt();
			System.out.print("Entra els minuts: ");
			minuts = lector.nextInt();
			System.out.print("Entra els segons: ");
			segons = lector.nextInt();

			segons++;

			minuts += segons/60;
			segons %= 60;

			hores += minuts/60;
			minuts %= 60;

			hores %= 24;

			System.out.format("%02d:%02d:%02d", hores, minuts, segons);
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}
	}
}
