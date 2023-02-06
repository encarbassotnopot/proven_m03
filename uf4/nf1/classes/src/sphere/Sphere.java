package sphere;

import java.util.Objects;

public class Sphere {

	private double radius;

	public Sphere(double radius) {
		setRadius(radius);
	}

	public Sphere() {
		this.radius = 0f;
	}

	public Sphere(Sphere sp) {
		setRadius(sp.radius);
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	public double getVolume() {
		return 4f / 3 * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public String toString() {
		return "Esfera de radi: " + radius;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sphere sphere = (Sphere) o;
		return Double.compare(sphere.radius, radius) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}
}
