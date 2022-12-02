import java.util.Scanner;
/**
 * Llegeix qualificació i mostra comentari
 * @author Jose
 */
public class Qualificacio {
	public static void main(String args[]) {
		Scanner lector = new Scanner(System.in);
		//llegir la qualificació
		System.out.print("Entra la teva qualificació: ");
		char qualificacio = lector.next().toUpperCase().charAt(0);
		//mostrar la qualificació entradaº
		System.out.println("La teva qualificació és " + qualificacio);
		//mostrar comentari
		switch (qualificacio) {
			case 'A':
				System.out.println("Excel·lent!");
				break;
			case 'B':
			case 'C':
				System.out.println("Ben fet!");
				break;
			case 'D':
				System.out.println("Insuficient");
			case 'E':
				System.out.println("Torna-ho a intentar");
			case 'F':
				System.out.println("Torna-ho a intentar");
				break;
			default:
				System.out.println("Qualificació no vàlida");
		}
	}
}