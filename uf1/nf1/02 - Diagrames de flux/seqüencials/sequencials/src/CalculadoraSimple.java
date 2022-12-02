import java.util.Scanner;

public class CalculadoraSimple {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		// llegim el primer operand
		System.out.print("Introdueix el primer operand");
		int operand1 = lector.nextInt();

		// llegim el segon operand
		System.out.print("Introdueix el segon operand");
		int operand2 = lector.nextInt();

		// llegim l'operador
		System.out.print("Introdueix l'operador");
		char operador = lector.next().charAt(0);

		int resultat = 0;

		switch (operador) {
			case '+':
				resultat = operand1 + operand2;
				break;
			case '-':
				resultat = operand1 - operand2;
				break;
			case '*':
				resultat = operand1 * operand2;
				break;
			case '/':
				resultat = operand1 / operand2;
				break;
		}

		System.out.printf("%d %c %d = %d", operand1, operador, operand2, resultat);
	}
}
