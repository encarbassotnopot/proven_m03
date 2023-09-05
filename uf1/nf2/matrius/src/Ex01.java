/**
 * Traspassa tres vectors d’enters d’N elements cada un a una matriu de 3
 * files i N+1 columnes, col·locant en la darrera columna la suma dels elements de
 * cada fila.
 * @author eina
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] v1 = {3, 5, 2, 12,  4, 7, 1, 0, 3, 1, 0};
		int[] v2 = {0, 6, 8,  3, 22, 1, 4, 5, 7, 8, 0};
		int[] v3 = {4, 2, 2,  2,  6, 1, 1, 1, 8, 0, 0};

		v1[v1.length-1] = sumaArray(v1);
		v2[v2.length-1] = sumaArray(v2);
		v3[v3.length-1] = sumaArray(v3);

		int[][] matriu = vectorAMatriu(v1, v2, v3);
		mostraMatriu(matriu);
	}

	/**
	 * Suma els valors d'una array
	 * @param array l'array que s'ha de sumar
	 * @return el resultat de la suma.
	 */
	static int sumaArray(int[] array) {
		int suma = 0;
		for (int i : array) {
			suma += i;
		}
		return suma;
	}

	/**
	 * Rep vectors i els retorna en una matriu
	 * @param vectors els vectors que s'han de convertir a matriu
	 * @return una matriu composta pels vectors
	 */
	static int[][] vectorAMatriu(int[]... vectors) {
		return vectors;
	}

	/**
	 * Imprimeix una matriu a la consola
	 * @param matriu la matriu a imprimir
	 */
	static void mostraMatriu(int[][] matriu) {
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j]);
				if (j+1 < matriu[i].length) {
					System.out.print("\t");
				}
			}
			if (i+1 < matriu.length) {
				System.out.print("\n");
			}
		}

	}
}
