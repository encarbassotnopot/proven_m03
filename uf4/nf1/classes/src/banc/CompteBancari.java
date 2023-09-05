package banc;

import java.util.Arrays;
import java.util.Objects;

public class CompteBancari {
	private String iban;
	private String titular;
	private double saldo;
	private double tipusInteres;
	private double comsissio;
	private Operacio[] operacions;

	private int numOperacions;
	public final int MAX_OPERACIONS = 1000;

	public CompteBancari(String iban, String titular, double tipusInteres, double comsissio) {
		this.iban = iban;
		this.titular = titular;
		this.saldo = 0;
		this.tipusInteres = tipusInteres;
		this.comsissio = comsissio;
		this.operacions = new Operacio[MAX_OPERACIONS];
		this.numOperacions = 0;
	}

	public String getIban() {
		return iban;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTipusInteres() {
		return tipusInteres;
	}

	public double getComsissio() {
		return comsissio;
	}

	public Operacio[] getOperacions() {
		return operacions;
	}

	public int getNumOperacions() {
		return numOperacions;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setTipusInteres(double tipusInteres) {
		this.tipusInteres = tipusInteres;
	}

	public void setComsissio(double comsissio) {
		this.comsissio = comsissio;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CompteBancari{");
		sb.append("iban='").append(iban).append('\'');
		sb.append(", titular='").append(titular).append('\'');
		sb.append(", saldo=").append(saldo);
		sb.append(", tipusInteres=").append(tipusInteres);
		sb.append(", comsissio=").append(comsissio);
		sb.append(", operacions=").append(operacions); // TODO
		sb.append(", numOperacions=").append(numOperacions);
		sb.append(", MAX_OPERACIONS=").append(MAX_OPERACIONS);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CompteBancari cb = (CompteBancari) o;
		return iban.equals(cb.iban);
	}

	@Override
	public int hashCode() {
		return Objects.hash(iban);
	}

	/**
	 * Fa sobre el compte l'operació donada, si hi ha prou saldo.
	 * @param op l'operació a realitzar
	 * @return true si l'operació és exitosa, false en cas contrari
	 */
	public boolean operar(Operacio op) {
		if (numOperacions < MAX_OPERACIONS) {
			return false;
		}
		if (saldo + op.getQuantitat() < 0) {
			return false;
		}
		saldo += op.getQuantitat();
		operacions[numOperacions] = op;
		numOperacions++;
		return true;
	}

	/**
	 * Realitza una transferència al destinatari d'acord amb l'operació
	 * @param desti el compte destinatari
	 * @param op l'operació a realitzar
	 * @return true si és exitosa, false en cas contrari
	 */
	public boolean transferir(CompteBancari desti, Operacio op) {
		return false;
	}

	public String llistaOpreacions {

	}
}
