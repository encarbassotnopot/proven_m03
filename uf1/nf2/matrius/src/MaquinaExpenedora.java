
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Màquina expenedora de llaminadures
 * @author Jose
 */
public class MaquinaExpenedora {

	public static void main(String[] args) {
		//dades del programa
		String[][] nomsLlaminadures = {
				{"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
				{"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
				{"Crispetes", "M&M'S", "Papa Delta", "Chicles de menta"},
				{"Patates Chips", "Crunch", "Milkybar", "Oreo"}
		};
		double[][] preus = {
				{1.1, 0.8, 1.5, 0.9},
				{1.8, 1, 1.2, 1},
				{1.8, 1.3, 1.2, 0.8},
				{1.5, 1.1, 1.1, 1.1}
		};
		int [][] existencies = {
				{5, 5, 5, 5},
				{5, 5, 5, 5},
				{5, 5, 5, 5},
				{5, 5, 5, 5}
		};
		//program menu
		final String[] menuOptions = {
				"Sortir (apagar màquina i mostrar vendes)",
				"Mostrar tot",
				"Demanar llaminadura",
				"Mostrar llaminadures columna",
				"Omplir llaminadures",
				"Mostrar existències"
		};
		boolean exit = false;
		do {
			//display menu and read user's option
			int optionSelected = displayMenuAndReadUserChoice(menuOptions);
			//execute option selected by user
			switch (optionSelected) {
				case 0:  //exit program
					exit = true;
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println("Bad option");
					break;
			}
		} while (!exit);
		System.out.println("Closing program");
	}

	/**
	 * displays options of program menu and inputs user's choice
	 *
	 * @param options the array of options of the menu
	 * @return index of selected option
	 */
	private static int displayMenuAndReadUserChoice(String[] options) {
		System.out.println("===== Grade manager menu =====");
		for (int i = 0; i < options.length; i++) {
			System.out.format("[%d]. %s\n", i, options[i]);
		}
		Scanner scan = new Scanner(System.in);
		int choice = -1;
		while (choice < 0) {
			try {
				//ask user's choice
				System.out.print("Select an option: ");
				choice = scan.nextInt();
				//validate choice
				if ((choice < 0) || (choice >= options.length)) {
					choice = -1;
				}
			} catch (InputMismatchException e) {
				scan.nextLine();
				choice = -1;
			}

		}
		return choice;
	}

	/**
	 * demana una posició a l'usuari, li entrega la llaminadura pertinent (si en queden) i actualitza les existencies.
	 * @param noms
	 * @param preus
	 * @param existencies
	 */
	static void demanarLlaminadura(String[][] noms, double[][] preus, int[][] existencies) {

	}

	/**
	 * Demana a l'usuari una posició a la màquina (array bidimensional) i retorna les coordenades
	 * @param noms l'array de la màquina
	 * @return les coordenades en el format [fila, columna]
	 */
	static int[] demanarPosicio(String[][] noms) {
		Scanner lector = new Scanner(System.in);
		int[] coords = {-1, -1};
		boolean correcte = false;
		do {
			try {
				System.out.print("Entra la fila: ");
				coords[0] = lector.nextInt();
				System.out.print("Entra la columna: ");
				coords[1] = lector.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor");
				lector.next();
			}

			if (coords[0] < 0 || coords[0] >= noms.length || coords[1] < 0 || coords[1] >= noms[0].length ) {
				correcte = true;
				System.out.println("Ítem inexistent. Torni a seleccionar-ne un.");
			}
		} while (!correcte);

	}
}
