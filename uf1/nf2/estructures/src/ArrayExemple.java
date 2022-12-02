public class ArrayExemple {
	public static void main(String[] args) {
		float[] c = new float[5];

		for (int i = 0; i < c.length; i++) {
			c[i] = (float) Math.random();
		}

		for (int i = 0; i < c.length; i++) {
			System.out.printf("c[%d] = %f\n", i, c[i]);
		}

		String[] d = {"a", "b", "c", "d", "e"};
		String[] e = new String[5];
		e[0] = new String("A");
		e[1] = "B";
		e[2] = "C";
		e[3] = "D";
		e[4] = "E";
	}

	static void printIntArray(int[] nums) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < nums.length; i++) {
			sb.append(nums[i]);
			sb.append(", ");
		}
		sb.append("]");
	}
}
