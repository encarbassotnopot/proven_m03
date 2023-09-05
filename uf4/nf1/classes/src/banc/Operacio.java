package banc;

import java.util.Objects;

public class Operacio {
	private String tipus;
	private double quantitat;
	private String data;

	public Operacio(String tipus, double quantitat, String data) {
		this.tipus = tipus;
		this.quantitat = quantitat;
		this.data = data;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public double getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(double quantitat) {
		this.quantitat = quantitat;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Operacio{");
		sb.append("tipus='").append(tipus).append('\'');
		sb.append(", quantitat=").append(quantitat);
		sb.append(", data='").append(data).append('\'');
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Operacio operacio = (Operacio) o;
		return Double.compare(operacio.quantitat, quantitat) == 0 && tipus.equals(operacio.tipus) && data.equals(operacio.data);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tipus, quantitat, data);
	}
}
