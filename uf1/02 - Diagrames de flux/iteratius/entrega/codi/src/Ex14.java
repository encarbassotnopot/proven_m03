import java.util.Scanner;

/**
 * Diu la manera més eficient (que fa servir menys bitllets) de donar una quanitat d'euros múltiple de 5.
 * @author eina
 */

public class Ex14 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.print("Introdueix la quanitat d'euros: ");
		int euros = lector.nextInt();

		int cinccents = euros / 500;
		euros %= 500;

		int doscents = euros / 200;
		euros %= 200;

		int cent = euros / 100;
		euros %= 100;

		int cincquanta = euros / 50;
		euros %= 50;

		int vint = euros / 20;
		euros %= 20;

		int deu = euros / 10;
		euros %= 10;

		int cinc = euros / 5;

		System.out.printf("Calen %d bitllets de 500, %d bitllets de 200, %d bitllets de 100, \n" +
				"%d bitllets de 50, %d bitllets de 20, %d bitllets de 10 i %d bitllets de 5.\n", cinccents, doscents, cent, cincquanta, vint, deu, cinc);

	}
}
