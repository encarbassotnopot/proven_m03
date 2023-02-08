package pt1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un pokemon i un digimon amb els parametres entrats per l'usuari, els fa lluitar i diu qui guanya
 * @author eina
 */
public class Lluita {
	public static void main(String[] args) {
		Lluita lluita = new Lluita();
		lluita.run();
	}

	public void run () {
		Pokemon pk = creaPokemon();
		Digimon dg = creaDigimon();
		boolean pkViu = true;
		boolean dgViu = true;
		do {
			dgViu &= dg.rebreAtac(pk.atacar());
			System.out.format("%s té %d punts de vida\n", dg.getName(), dg.getLifePoint());
			if (dgViu) {
				pkViu = pk.rebreAtac(dg.atacar());
				System.out.format("%s té %d punts de vida\n", pk.getName(), pk.getLifePoint());
			}
		} while (dgViu && pkViu);
		if (pkViu) {
			System.out.format("%s és el guanyador!", pk.getName());
		} else {
			System.out.format("%s és el guanyador!", dg.getName());
		}
	}

	/**
	 * Demana a l'usuari la informació necessària per crear un pokemon i el crea
	 * @return el pokemon creat amb la informació donada per l'usuari
	 */
	Pokemon creaPokemon() {
		Scanner sc = new Scanner(System.in);
		// nom
		System.out.println("Creació el Pokemon");
		System.out.print("Entra el nom del Pokemon: ");
		String nom = sc.nextLine();
		// punts vida
		boolean vidaValida = false;
		int puntsVida = 0;
		do {
			System.out.print("Entra els punts de vida del Pokemon: ");
			try {
				puntsVida = sc.nextInt();
				if (puntsVida > 0) {
					vidaValida = true;
				} else {
					System.out.println("El Pokemon ha de tenir com a mínim un punt de vida!");
				}
			} catch (InputMismatchException e) {
				System.out.println("No s'ha pogut llegir el valor");
				sc.next();
			}
		} while (!vidaValida);

		return new Pokemon(nom, puntsVida);
	}
	/**
	 * Demana a l'usuari la informació necessària per crear un digimon i el crea
	 * @return el digimon creat amb la informació donada per l'usuari
	 */
	Digimon creaDigimon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Creació el Digimon");
		System.out.print("Entra el nom del Digimon: ");
		String nom = sc.nextLine();
		return new Digimon(nom);
	}
}
