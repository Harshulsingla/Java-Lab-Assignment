
 public class Practice {

	// question 1
	public static void fibonacci() {
		int a = 1;
		int b = 1;
		int c = 0;
		double sum = 2;
		System.out.print(a + " " + b);
		for (int i = 0; i < 18; i++) {
			c = a + b;
			System.out.print(" " + c);
			sum = sum + c;
			a = b;
			b = c;
		}
		System.out.println(' ');
		System.out.println(sum / 20);
	}

	// question 2
	public static void table() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println(" ");
		}
	}

	// question 4
//	public static int[] copyOf(int[] array) {

//	}

	// question 5
	public static void pattern() {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

//	public static void main(String[] args) {
//		// fibonacci();
//		// table();
//		// pattern();
//	}

}
