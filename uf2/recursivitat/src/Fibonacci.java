public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}

	static int fibonacci(int posicio) {
		if (posicio < 3) {
			return 1;
		}
		return fibonacci(--posicio) + fibonacci(--posicio);
	}
}
