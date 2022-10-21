import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix dos números i en calcula i mostra
 * la suma, resta, producte i quocient.
 * @author eina
 */

public class Ex10 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		try {
			// llegir el primer número
			System.out.print("Entra el primer número: ");
			n1 = lector.nextDouble();
			// llegir el segon número
			System.out.print("Entra el segon número: ");
			n2 = lector.nextDouble();

			// calcular i mostrar la suma
			double suma = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + suma);

			// calcular i mostrar la resta
			double resta = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + resta);

			// calcular i mostrar el producte
			double producte = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + producte);

			// calcular i mostrar el quocient, si existeix.
			if (n2 != 0) {
				double quocient = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + quocient);
			} else {
				System.out.println("No es pot calcular " + n1 + " / " + n2 + ", ja que el divisor és 0");
			}
		} catch (InputMismatchException e) {
			System.out.println("No s'ha pogut llegir el valor.");
		}
	}
}
