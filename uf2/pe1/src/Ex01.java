import java.util.Scanner;

/**
 * Simula un llançament de penals entre el jugador i l'ordinador.
 * Primer xuta el jugador, després l'ordinador i finalment mostra el marcador.
 * @author eina
 */
public class Ex01 {
	public static void main(String[] args) {
		int golsJugador = 0;
		int golsOrdinador = 0;
		int rondesJugadaes = 0;

		do {
			rondesJugadaes++;
			String llocJugador;
			String llocOrdinador;

			// el jugador xuta
			llocJugador = escollirLloc("jugador");
			llocOrdinador = escollirLloc("ordinador");
			if (hiHaGol(llocJugador, llocOrdinador)) {
				golsJugador++;
			}
			mostrarLlocs("jugador", llocJugador, llocOrdinador);
			mostrarMarcador(golsJugador, golsOrdinador);

			// l'ordinador xuta
			llocJugador = escollirLloc("jugador");
			llocOrdinador = escollirLloc("ordinador");
			if (hiHaGol(llocJugador, llocOrdinador)) {
				golsOrdinador++;
			}
			mostrarLlocs("ordinador", llocOrdinador, llocJugador);
			mostrarMarcador(golsJugador, golsOrdinador);

		} while (continuarJugant(rondesJugadaes, golsJugador, golsOrdinador));

		if (golsJugador == golsOrdinador) {
			System.out.println("Heu empatat!");
		} else if (golsJugador > golsOrdinador) {
			System.out.println("Has guanyat!");
		} else {
			System.out.println("Has perdut!");
		}
	}

	/**
	 * Retorna el lloc on va la pilota o on es tira el porter.
	 * @param jugador "jugador" si li toca escollir a l'usuari, "ordinador" si ha d'escollir l'ordinador
	 * @return "esquerra", "centre" o "dreta"
	 */
	static String escollirLloc(String jugador) {
		String lloc = "";
		if (jugador == "jugador") {
			boolean llocValid = false;
			do {
				Scanner lector = new Scanner(System.in);
				System.out.print("Entra el lloc ([e]squerra/[c]entre/[d]reta): ");
				lloc = lector.next();

				switch (lloc.toLowerCase()) {
					case "e":
						lloc = "esquerra";
						llocValid = true;
						break;
					case "c":
						lloc = "centre";
						llocValid = true;
						break;
					case "d":
						lloc = "dreta";
						llocValid = true;
						break;
				}
				if (!llocValid) {
					System.out.println("Lloc invàlid");
				}
			} while (!llocValid);

		} else if (jugador == "ordinador") {
			switch ((int) (Math.random() * 3)) {
				case 0:
					lloc = "esquerra";
					break;
				case 1:
					lloc = "centre";
					break;
				case 2:
					lloc = "dreta";
					break;
			}
		}
		return lloc;
	}

	/**
	 * Mostra qui tira, cap a on va el tir i on va el porter
	 * @param tirador "jugador" o "ordinador"
	 * @param xut a on va la pilota "esquerra", "centre" o "dreta"
	 * @param porter a on va el porter "esquerra", "centre" o "dreta"
	 */
	static void mostrarLlocs(String tirador, String xut, String porter) {
		System.out.println("Xuta " + posaArticle(tirador));
		System.out.println("La pilota va a " + posaArticle(xut));
		System.out.println("El porter es llança cap a " + posaArticle(porter));
	}

	/**
	 * Afegeix l'article corresponent davant d'una paraula
	 * @return la paraula amb l'article, o una cadena de text buida si la paraula no existeix
	 */
	static String posaArticle (String paraula) {
		String paraulaArticle = "";
		switch (paraula) {
			case "jugador":
				paraulaArticle = "el jugador";
				break;
			case "ordinador":
				paraulaArticle = "l'ordinador";
				break;
			case "esquerra":
				paraulaArticle = "l'esquerra";
				break;
			case "centre":
				paraulaArticle = "el centre";
				break;
			case "dreta":
				paraulaArticle = "la dreta";
				break;
		}
		return paraulaArticle;
	}

	/**
	 * Mostra el marcador
	 * @param jugador els gols que ha marcat l'usuari
	 * @param ordinador els gols que ha marcat l'ordinador
	 */
	static void mostrarMarcador(int jugador, int ordinador) {
		System.out.println("*****Marcador*****");
		System.out.format("Jugador:\t%d gols\n", jugador);
		System.out.format("Ordinador:\t%d gols\n", ordinador);
		System.out.println("******************\n");
	}

	/**
	 * Retorna si s'ha marcat un gol.
	 * @param xut a on va la pilota "esquerra", "centre" o "dreta"
	 * @param porter a on va el porter "esquerra", "centre" o "dreta"
	 * @return true si s'ha marcat un gol, false en cas contrari
	 */
	static boolean hiHaGol(String xut, String porter) {
		return xut != porter;
	}

	/**
	 * Retorna si s'ha de continuar jugant.
	 * Es continua jugant si no s'ha arribat al màxim de rondes i si la diferència de gols és major a les rondes restants.
	 * @param ronda el número de ronda actual
	 * @param jugador els gols que ha marcat l'usuari
	 * @param ordinador els gols que ha marcat l'ordinador
	 * @return true si s'ha de continuar jugant, false en cas contrari
	 */
	static boolean continuarJugant(int ronda, int jugador, int ordinador) {
		int MAXIM_RONDES = 5;
		boolean continuar = true;

		if (ronda >= MAXIM_RONDES) {
			continuar = false;
		} else if (Math.abs(jugador - ordinador) > MAXIM_RONDES - ronda) {
			continuar = false;
		}
		return continuar;
	}
}
