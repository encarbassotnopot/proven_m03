import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mostra un menú a l'usuari, amb opcions de calcular perímetre, area i volum a partir d'un radi.
 * @author eina
 */
public class Ex21 {
	public static void main(String[] args) {
		boolean sortir = false;
		double r, p, a, v;
		do {
			int opcio = menu();
			switch (opcio) {
				case 0:
					sortir = true;
					break;
				case 1:
					r = demanaRadi();
					p = perimetre(r);
					System.out.printf("Una circumferència de radi %.2f té un perímetre de %.2f\n", r, p);
					break;
				case 2:
					r = demanaRadi();
					a = area(r);
					System.out.printf("Una circumferència de radi %.2f té una àrea de %.2f\n", r, a);
					break;
				case 3:
					r = demanaRadi();
					v = volum(r);
					System.out.printf("Una esfera de radi %.2f té un volum de %.2f\n", r, v);
					break;
				case 4:
					r = demanaRadi();
					p = perimetre(r);
					a = area(r);
					v = volum(r);
					System.out.printf("Una circumferència de radi %.2f té un perímetre de %.2f i una àrea de %.2f\n", r, p, a);
					System.out.printf("Una esfera de radi %.2f té un volum de %.2f\n", r, v);
					break;
				default:
					System.out.println("Opció no vàlida");
			}
		} while (!sortir);
	}

	/**
	 * Mostra el menú del programa i retorna l'opció escollida per l'usuari
	 * @return 1 pel perímetre, 2 per l'àrea, 3 pel volum, 4 per totes, 0 per sortir i -1 per entrada errònia
	 */
	static int menu() {
		int opcio = -1;

		System.out.println("Menú del programa:");
		System.out.println("1) Càlcul perímetre");
		System.out.println("2) Càlcul àrea");
		System.out.println("3) Càlcul volum");
		System.out.println("4) Càlcul perímetre, àrea i volum");
		System.out.println("0) Sortir");

		try {
			Scanner lector = new Scanner(System.in);
			System.out.print("Entra una opció: ");
			opcio = lector.nextInt();
		} catch (InputMismatchException ignored) {}

		return opcio;
	}

	/**
	 * Demana el radi a l'usuari
	 * @return El radi entrat per l'usuari
	 */
	static double demanaRadi() {
		boolean correcte = false;
		double radi = 0;
		do {
			try {
				Scanner lector = new Scanner(System.in);
				System.out.print("Entra el radi: ");
				radi = lector.nextDouble();
				correcte = true;
			} catch (InputMismatchException ignored) {}
		} while (!correcte);
		return radi;
	}

	/**
	 * Calcula el perímetre d'una circumferència
	 * @param radi radi de la circumferència
	 * @return el perímetre de la circumferència
	 */
	static double perimetre(double radi) {
		return 2 * Math.PI * radi;
	}

	/**
	 * Calcula l'àrea d'una circumferència
	 * @param radi radi de la circumferència
	 * @return l'àrea de la circumferència
	 */
	static double area(double radi) {
		return Math.PI * Math.pow(radi, 2);
	}

	/**
	 * Calcula el volum d'una esfera
	 * @param radi radi de l'esfera
	 * @return el volum de l'esfera
	 */
	static double volum(double radi) {
		return 4.0 / 3.0 * Math.PI * Math.pow(radi, 3);
	}

}
