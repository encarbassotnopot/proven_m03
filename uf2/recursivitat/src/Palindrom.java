import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		System.out.println("Entra una frase (sense espais ni accents): ");
		String frase = lector.next();

		if (esPalindrom(frase)) {
			System.out.format("La frase %s és un palíndrom\n", frase);
		} else {
			System.out.format("La frase %s no és un palíndrom\n", frase);
		}
	}

	static boolean esPalindrom(String frase){
		if (frase.length() < 2) {
			return true;
		} else if (frase.charAt(0) == frase.charAt(frase.length()-1)) {
			return esPalindrom(frase.substring(1, frase.length()-1));
		}
		return false;
	}
}
