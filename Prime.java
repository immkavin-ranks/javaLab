package javaLab;

public class Prime {
	public static void main(String[] args) {
		int x = 11;

		System.out.println("is Prime: " + isPrime(x));

		for (int i = 1; i < x + 1; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		int count = 0, i = 2;
		while (count < x) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		System.out.println();
	}

	private static boolean isPrime(int x) {
		if (x == 2 || x == 3)
			return true;
		if (x < 2 || x % 2 == 0 || x % 3 == 0)
			return false;
		for (int i = 5; i * i <= x; i += 6) {
			if (x % i == 0 || x % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
}
