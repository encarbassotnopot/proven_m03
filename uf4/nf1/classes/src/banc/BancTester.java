package banc;

public class BancTester {
	public static void main(String[] args) {
		BancTester bt = new BancTester();
		bt.run();
	}

	public void run() {
		CompteBancari cb1 = new CompteBancari("001", "Laia", 0.1, 3.5);
		CompteBancari cb2 = new CompteBancari("002", "Marta", 0.3, 2.5);

		System.out.println("cb1=" + cb1);
		System.out.println("cb2=" + cb2);

		Operacio op1 = new Operacio("ingrés", 10, "2023-02-06");
		mostraResultatOperacio(cb1.operar(op1));

		Operacio op2 = new Operacio("transferencia", 10, "2023-02-06");
		mostraResultatOperacio(cb1.transferir(cb2, op2));

	}

	/**
	 * Mostra un missatge informant de si l'operació s'ha realitzat o no.
	 * @param exitosa el resultat de l'operació: true si és exitosa, false en cas contrari
	 */
	private void mostraResultatOperacio(boolean exitosa) {
		if (exitosa) {
			System.out.println("Operació realitzada amb èxit.");
		} else {
			System.out.println("Operació no realitzada.");
		}
	}
}
