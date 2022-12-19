import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

/**
 * Demana el nom a l'usuari i per on vol escurçar-lo. Genera un nick amb 4 caràcters del nom i un número aleatori.
 * @author eina
 */
public class GeneraNick {
	public static void main(String[] args) {
		StringBuilder nick = new StringBuilder();
		String nom = demanaNom();

		if (nom.length() > 4) {
			String retallar = preguntaRetallar();
			if (retallar.equals("first")) {
				nick.append(nom, 0, 4);
			} else {
				nick.append(nom, nom.length()-4, nom.length());
			}
		} else {
			nick.append(nom);
		}

		nick.append("_");
		nick.append((int) (Math.random()*10000) + 1);

		System.out.println(nick);
	}

	/**
	 * Demana un nom de més de quatre caràcters a l'usuari
	 * @return El nom entrat per l'usuari
	 */
	static String demanaNom() {
		boolean nomValid = false;
		String nom = "";
		do {
			System.out.print("Entra el teu nom: ");
			Scanner s = new Scanner(System.in);
			nom = s.nextLine().replaceAll("\\s", "");
			if (nom.length() >= 4) {
				nomValid = true;
			} else {
				System.out.println("El nom ha de tenir com a mínim 4 caràcters");
			}
		} while (!nomValid);
		return nom;
	}

	/**
	 * Demana per on vol retallar el nom
	 * @return "first" si vol retallar per davant o "last" si ho vol fer per darrera
	 */
	static String preguntaRetallar() {
		boolean retallarValid = false;
		String retallar = "";
		do {
			System.out.print("Per on vols retallar? Davant (first) o darrera (last): ");
			Scanner s = new Scanner(System.in);
			retallar = s.next();
			if (retallar.equals("first") || retallar.equals("last")) {
				retallarValid = true;
			} else {
				System.out.println("Has de dir 'first' o 'last'");
			}
		} while (!retallarValid);
		return retallar;
	}
}
