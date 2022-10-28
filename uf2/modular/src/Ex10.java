import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana dia, mes i any d'una data i verifica els valors
 * @author eina
 */
public class Ex10 {
	public static void main(String[] args) {
		boolean correcte = false;
		int dia = 0;
		int mes = 0;
		int any = 0;

		// entrada
		Scanner lector = new Scanner(System.in);
		try {
			System.out.print("Entra el dia: ");
			dia = lector.nextInt();
			System.out.print("Entra el mes: ");
			mes = lector.nextInt();
			System.out.print("Entra l'any: ");
			any = lector.nextInt();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor");
		}

		// operacions i sortida
		if (correcte) {
			if (verificaData(dia, mes, any)) {
				System.out.printf("La data %02d/%02d/%04d és vàlida", dia, mes, any);
			} else {
				System.out.printf("La data %02d/%02d/%04d no és vàlida", dia, mes, any);
			}
		}
	}

	/**
	 * Verifica si una data és correcte (amb mesos de 30 dies)
	 * @param dia el dia del mes (mesos de 30 dies)
	 * @param mes el mes de l'any
	 * @param any l'any (considerem els negatius com aC, però no pot ser 0)
	 * @return true si la data és vàlida, false en cas contrari.
	 */
	static boolean verificaData(int dia, int mes, int any) {
		boolean dataValida = true;
		if (dia < 0 || 30 < dia) {
			dataValida = false;
		}
		if (mes < 0 || 12 < mes) {
			dataValida = false;
		}
		if (any==0) {
			dataValida = false;
		}
		return dataValida;
	}
}
