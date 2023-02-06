package sphere;
public class SphereMain {

	public static void main(String[] args) {
		Sphere s1 = new Sphere();
		Sphere s2 = new Sphere(3);

		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);
		s1.setRadius(5);
		System.out.println("S1: " + s1);

		System.out.println("S1 àrea: " + s1.getArea());
		System.out.println("S1 volum: " + s1.getVolume());
		System.out.println("S2 àrea: " + s2.getArea());
		System.out.println("S2 volum: " + s2.getVolume());
	}
}
