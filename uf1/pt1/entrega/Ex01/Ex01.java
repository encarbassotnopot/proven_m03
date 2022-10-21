import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Validador de dates. L'usuari entra una data (dia, mes i any) que serà validada.
 * L'any no ha de ser anterior a 1900.
 * @author eina
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int any = 0;
		boolean anyInvalid = true;
		do {
			try {
				// demanem l'any
				System.out.print("Entra l'any: ");
				any = lector.nextInt();

				// comprovem la validesa
				if (any < 1900) {
					System.out.printf("L'any no pot ser anterior a 1900, has entrat %d.\n", any);
				} else {
					anyInvalid = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor.");
				lector.nextLine(); // netegem el buffer
			}
		} while (anyInvalid);

		int mes = 0;
		boolean mesInvalid = true;
		do {
			try {
				// demanem el mes
				System.out.print("Entra el mes: ");
				mes = lector.nextInt();

				// comprovem la validesa
				if (0 < mes && mes <= 12) {
					mesInvalid = false;
				} else {
					System.out.printf("El mes ha d'estar entre 1 i 12. Has entrat %d.\n", mes);
				}
			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor.");
				lector.nextLine(); // netegem el buffer
			}
		} while (mesInvalid);

		int dia = 0;
		boolean diaInvalid = true;
		do {
			try {
				// demanem el dia
				System.out.print("Entra el dia: ");
				dia = lector.nextInt();

				// comprovem la validesa
				int limit = 0;
				switch (mes) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						if (0 < dia && dia <= 31) {
							diaInvalid = false;
						} else {
							limit = 31;
						}
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						if (0 < dia && dia <= 30) {
							diaInvalid = false;
						} else {
							limit = 30;
						}
						break;
					case 2:
						if (0 < dia && dia <= 28) {
							diaInvalid = false;
						} else {
							limit = 28;
						}
				}
				if (diaInvalid) {
					System.out.printf("El dia ha d'estar entre 1 i %d. Has entrat %d.\n", limit, dia);
				}
			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor.");
				lector.nextLine(); // netegem el buffer
			}
		} while (diaInvalid);

		// amb tot comprovat, podem mostrar la data a l'usuari.
		System.out.printf("La data s'ha validat correctament: %02d/%02d/%02d \n", dia, mes, any);
	}
}
