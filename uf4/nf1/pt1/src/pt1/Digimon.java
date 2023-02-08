package pt1;

public class Digimon {
	private String name;
	private int lifePoint;
	private boolean shield;

	Digimon (String name) {
		this.name = name;
		this.lifePoint = 600;
		this.shield = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifePoint() {
		return lifePoint;
	}

	public boolean isShield() {
		return shield;
	}

	/**
	 * Si no hi ha cap escut actiu, resta la força de l'atac rebut dels punts de vida (fins que es quedin a 0) i retorna si segueix viu o no.
	 * Si hi ha un escut actiu desactiva l'escut i n'informa.
	 * @param forca la força de l'atac rebut.
	 * @return true si segueix viu (punts de vida > 0), false en cas contrari
	 */
	public boolean rebreAtac(int forca) {
		if (shield) {
			System.out.println("Escut desactivat");
			shield = false;
 		} else {
			lifePoint = Math.max(lifePoint - forca, 0);
		}
		return lifePoint > 0;
	}


	/**
	 * Calcula i retorna la força d'atac d'un digimon. Mostra a la consola el seu nom i el valor de l'atac.
	 * El valor de la força és aleatori i oscil·la entre 30 i 200.
	 * @return la força de l'atac
	 */
	public int atacar() {
		int forca = (int) (Math.random() * 171) + 30;
		System.out.println(name + " digimon ataca amb força " + forca);
		return forca;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Digimon{");
		sb.append("name='").append(name).append('\'');
		sb.append(", lifePoint=").append(lifePoint);
		sb.append('}');
		return sb.toString();
	}
}
