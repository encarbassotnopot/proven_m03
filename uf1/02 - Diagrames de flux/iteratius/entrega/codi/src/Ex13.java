import java.util.Scanner;

/**
 * Endevina un número entre 1 i 100
 * @author eina
 */

public class Ex13 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		char resposta = ' ';
		int candidat = 50;
		int pas = 50;

		do {
			System.out.printf("El nombre és %d? \n", candidat);
			System.out.print("és més [g]ran / [p]etit / [e]xacte: ");
			resposta = lector.next().charAt(0);

			pas = Math.max(pas / 2, 1);1
			if (resposta == 'g') {
				candidat += pas;
			} else if (resposta == 'p') {
				candidat -= pas;
			}
		} while (resposta != 'e');
	}
}
