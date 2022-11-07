import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calcula la lletra del DNI.
 * @author eina
 */
public class Ex18 {
	public static void main(String[] args) {
		boolean correcte = false;
		int dni = 0;

		// entrada
		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra el DNI: ");
			dni = lector.nextInt();
			if (dni < 0) {
				System.out.println("El DNI no pot ser negatiu");
			} else {
				correcte = true;
			}
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}

		if (correcte) {
			System.out.printf("%08d%c", dni, lletraDNI(dni));
		}
	}

	/**
	 * Calcula la lletra del dni
	 * @param dni el número del dni
	 * @return la lletra del dni
	 */
	static char lletraDNI(int dni) {
		char lletra = ' ';
		switch (dni % 23) {
			case 0:
				lletra = 'T';
				break;
			case 1:
				lletra = 'R';
				break;
			case 2:
				lletra = 'W';
				break;
			case 3:
				lletra = 'A';
				break;
			case 4:
				lletra = 'G';
				break;
			case 5:
				lletra = 'M';
				break;
			case 6:
				lletra = 'Y';
				break;
			case 7:
				lletra = 'F';
				break;
			case 8:
				lletra = 'P';
				break;
			case 9:
				lletra = 'D';
				break;
			case 10:
				lletra = 'X';
				break;
			case 11:
				lletra = 'B';
				break;
			case 12:
				lletra = 'N';
				break;
			case 13:
				lletra = 'J';
				break;
			case 14:
				lletra = 'Z';
				break;
			case 15:
				lletra = 'S';
				break;
			case 16:
				lletra = 'Q';
				break;
			case 17:
				lletra = 'V';
				break;
			case 18:
				lletra = 'H';
				break;
			case 19:
				lletra = 'L';
				break;
			case 20:
				lletra = 'C';
				break;
			case 21:
				lletra = 'K';
				break;
			case 22:
				lletra = 'E';
				break;
		}
		return lletra;
	}
}
