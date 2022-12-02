import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calcula i interpreta l'IMC de l'usuari a partir del seu pes i alçada
 * @author eina
 */
public class IMC {
	public static void main(String[] args) {
		// entrada i validació
		double pes = demanaPes();
		double estatura = demanaEstatura();

		// càlcul i sortida
		double imc = calcularIMC(pes, estatura);
		System.out.printf("Tens un IMC de %.2f\n", imc);
		interpretarIMC(imc);
	}

	/**
	 * Calcula l'index de massa corporal
	 * @param pes el pes en KG
	 * @param estatura l'alçada en metres
	 * @return l'IMC
	 */
	static double calcularIMC(double pes, double estatura) {
		return pes / Math.pow(estatura, 2);
	}

	/**
	 * Mostra a l'usuari la interpretació de l'index.
	 * pes baix per a imc < 18,5, normal a partir de 18,5 fins a 25 i sobrepes a partir de 25
	 * @param imc l'imc
	 */
	static void interpretarIMC(double imc) {
		if (imc < 18.5) {
			System.out.println("Pes baix");
		} else if (imc < 25) {
			System.out.println("Pes normal");
		} else {
			System.out.println("Sobrepes");
		}
	}

	/**
	 * Demana el pes a l'usuari i s'assegura que sigui vàlid
	 * @return el pes entrat per l'usuari
	 */
	static double demanaPes() {
		Scanner lector = new Scanner(System.in);
		boolean pesValid = false;
		double pes = 0;
		do {
			try {
				System.out.print("Entra el teu pes (en kg): ");
				pes = lector.nextDouble();
				if (0 < pes && pes <= 635) {
					pesValid = true;
				} else {
					System.out.println("Entra un pes vàlid.");
				}
			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor.");
				lector.next();
			}
		} while (!pesValid);
		return pes;
	}

	/**
	 * Demana l'estatura a l'usuari i la valida
	 * @return l'estatura de l'usuari
	 */
	static double demanaEstatura() {
		Scanner lector = new Scanner(System.in);
		boolean estaturaValida = false;
		double estatura = 0;
		do {
			try {
				System.out.print("Entra la teva alçada (en metres): ");
				estatura = lector.nextDouble();
				if (0 < estatura && estatura <= 2.75) {
					estaturaValida = true;
				} else {
					System.out.println("Entra una alçada vàlida.");
				}
			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor.");
				lector.next();
			}
		} while (!estaturaValida);
		return estatura;
	}
}
