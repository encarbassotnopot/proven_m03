package pt1;

public class Pokemon {
	private String name;
	private int lifePoint;
	private int combatPoint;

	Pokemon (String name, int lifePoint) {
		this.name = name;
		if (lifePoint > 1000) {
			this.lifePoint = 1000;
		} else {
			this.lifePoint = lifePoint;
		}
		this.combatPoint = (int) (Math.random() * 101) + 100;
	}


	public String getName() {
		return name;
	}

	public int getLifePoint() {
		return lifePoint;
	}

	public int getCombatPoint() {
		return combatPoint;
	}

	public void setCombatPoint(int combatPoint) {
		this.combatPoint = combatPoint;
	}

	/**
	 * Mostra a la consola el nom i la força amb la qual ataca un pokemon
	 * @param forca la força de l'atac
	 */
	private void critCombat(int forca) {
		System.out.println(name + " pokemon a l'atac amb força " + forca);
	}

	/**
	 * Resta la força de l'atac rebut dels punts de vida (fins que es quedin a 0) i retorna si segueix viu o no
	 * @param forca la força de l'atac rebut.
	 * @return true si segueix viu (punts de vida > 0), false en cas contrari
	 */
	public boolean rebreAtac(int forca) {
		lifePoint = Math.max(lifePoint - forca, 0);
		return lifePoint > 0;
	}

	/**
	 * Calcula i retorna la força d'atac d'un pokemon. Crida a critCombat per mostrar-ho a la consola.
	 * El valor de la força és el de combatPoint, excepte si té menys de 100 punts de vida, que el valors serà el doble.
	 * @return la força de l'atac
	 */
	public int atacar() {
		int forca = lifePoint < 100 ? combatPoint * 2 : combatPoint;
		critCombat(forca);
		return forca;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Pokemon{");
		sb.append("name='").append(name).append('\'');
		sb.append(", lifePoint=").append(lifePoint);
		sb.append('}');
		return sb.toString();
	}
}
