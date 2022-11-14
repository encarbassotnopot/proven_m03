import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Simula una màquina escurabutxaques
 * @author eina
 */
public class Jackpot {
	public static void main(String[] args) {
		int saldo = 10;

		do {
			// demana aposta i la substrau del saldo
			int aposta = quantitatApostada(saldo);
			saldo -= aposta;

			// genera i mostra els discs
			char d1 = tiradaDisc();
			char d2 = tiradaDisc();
			char d3 = tiradaDisc();
			mostrarTirada(d1, d2, d3);

			// actualitza el saldo amb el premi
			saldo += calcularPremi(d1, d2, d3, aposta);

		} while (seguirJugant(saldo));

		if (saldo < 1) {
			System.out.println("T'has quedat sense monedes!");
		} else if (saldo >= 25) {
			System.out.format("Felicitats! Tens %d monedes!\n", saldo);
		}
	}

	/**
	 * Pregunta a l'usuari quant aposta i retorna aquesta quantitat
	 *
	 * @param saldo el saldo actual de l'usuari
	 * @return la quantitat apostasda
	 */
	static int quantitatApostada(int saldo) {
		int aposta = 0;
		boolean apostaValida = false;
		Scanner lector = new Scanner(System.in);

		do {
			try {
				System.out.format("Tens %d monedes. Entra la quantitat que vols apostar: ", saldo);
				aposta = lector.nextInt();
				if (aposta < 1) {
					System.out.println("Has d'apostar una quantitat positiva!");
				} else if (aposta > saldo) {
					System.out.println("No pots apostar més monedes que les que tens!");
				} else {
					apostaValida = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada no vàlida.");
				lector.next();
			}
		} while (!apostaValida);

		return aposta;
	}

	/**
	 * Simula un disc d'una màquina escurabutxaques
	 * @return A, B o C
	 */
	static char tiradaDisc() {
		char resultat = ' ';
		switch ((int) (Math.random() * 3)) {
			case 0:
				resultat = 'A';
				break;
			case 1:
				resultat = 'B';
				break;
			case 2:
				resultat = 'C';
				break;
		}
		return resultat;
	}

	/**
	 * Mostra el resultat d'una tirada
	 * @param d1 resultat del primer disc
	 * @param d2 resultat del segon disc
	 * @param d3 resultat del tercer disc
	 */
	static void mostrarTirada(char d1, char d2, char d3) {
		System.out.println("*".repeat(13));
		System.out.printf("* %c - %c - %c *\n", d1, d2, d3);
		System.out.println("*".repeat(13));
	}

	/**
	 * calcula els diners guanyats (+5 amb tres As, +2 amb tres Bs i el doble de l'aposta amb tres Cs)
	 * @param d1 resultat del primer disc
	 * @param d2 resultat del segon disc
	 * @param d3 resultat del tercer disc
	 * @param aposta la quantitat apostasda
	 * @return les monedes guanyades
	 */
	static int calcularPremi(char d1, char d2, char d3, int aposta){
		int premi = 0;
		String disc1 = String.valueOf(d1).toUpperCase();
		String disc2 = String.valueOf(d2).toUpperCase();
		String disc3 = String.valueOf(d3).toUpperCase();

		if (disc1.equals(disc2) && disc2.equals(disc3)) {
			switch (disc1) {
				case "A":
					premi = 5;
					break;
				case "B":
					premi = 2;
					break;
				case "C":
					premi = aposta * 2;
					break;
			}
		}
		return premi;
	}

	/**
	 * Determina si es pot seguir jugant (és a dir, el saldo és positiu i no supera 25)
	 * @param saldo el saldo actual de l'usuari
	 * @return true per seguir jugant, false en cas contrari
	 */
	static boolean seguirJugant(int saldo) {
		return (saldo > 0 && saldo < 25);
	}
}
