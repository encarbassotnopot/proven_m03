/**
 * Joc que consisteix en arribar al final d'un tauler de 30 caselles, amb 4 caselles aleatòries de mort.
 * S'avança la quantitat de caselles indicades per un dau.
 * @author eina
 */
public class CarreraMortal {
	public static void main(String[] args) {
		final int MIDA_TAULER = 30;
		int[] tauler = new int[MIDA_TAULER];
		int posicio = -1;
		boolean seguirJugant = true;
		inicialitzarTauler(tauler);
		definirCasellesMort(tauler);
		do {
			posicio += tirarDau();
			mostrarTauler(tauler, posicio);
			if (posicio < tauler.length) {
				seguirJugant = comprovarCasellaValida(tauler, posicio);
			} else {
				seguirJugant = false;
			}
		} while (seguirJugant);
	}

	/**
	 * Inicialitza totes les posicions del tauler amb el valor 1
	 * @param tauler El tauler de joc
	 */
	static void inicialitzarTauler(int[] tauler) {
		for (int i = 0; i < tauler.length; i++) {
			tauler[i] = 1;
		}
	}

	/**
	 * Escull i marca aleatoriament 4 caselles per marcar amb el valor 0 (mort)
	 * @param tauler El tauler de joc
	 */
	static void definirCasellesMort(int[] tauler) {
		final int CASELLES_MORT = 4;
		int casellesMarcades = 0;
		while (casellesMarcades < CASELLES_MORT) {
			int pos = (int) (Math.random() * tauler.length);
			if (tauler[pos] != 0) {
				tauler[pos] = 0;
				casellesMarcades++;
			}
		}
	}

	/**
	 * Mostra el tauler separant les caselles amb guions i indicant la posició del jugador entre parèntesis
	 * @param tauler El tauler de joc
	 * @param posicio La posició del jugador
	 */
	static void mostrarTauler(int[] tauler, int posicio){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tauler.length; i++) {
			if (i == posicio) {
				sb.append("(");
			}
			sb.append(tauler[i]);
			if (i == posicio) {
				sb.append(")");
			}
			if (i < tauler.length-1) {
				sb.append("-");
			}
		}
		System.out.println(sb);
	}

	/**
	 * Simula la tirada d'un dau de 6 cares.
	 * @return Un valor de l'1 al 6 (ambdós inclosos)
	 */
	static int tirarDau() {
		return (int) (Math.random()*6) + 1;
	}

	/**
	 * Retorna true si la casella no és mort, i true en cas contrari
	 * @param tauler El tauler de joc
	 * @param posicio La posició del jugador. Ha d'estar dins del tauler.
	 * @return false si la casella és mort (0) i true si ho és (1)
	 */
	static boolean comprovarCasellaValida(int[] tauler, int posicio) {
		return tauler[posicio] != 0;
	}
}
