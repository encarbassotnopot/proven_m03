public class GraellaSelec {
	public static void main(String[] args) {
		int[][] graella = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		imprimirGraella(graella, 1, 2);
	}

	static void imprimirGraella(int[][] graella, int filaSelec, int columnaSelec) {
		for (int fila = 0; fila < graella.length; fila++) {
			for (int columna = 0; columna < graella[fila].length; columna++) {
				if (fila == filaSelec && columna == columnaSelec) {
					System.out.print("(");
				}
				System.out.print(graella[fila][columna]);
				if (fila == filaSelec && columna == columnaSelec) {
					System.out.print(")");
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
