package javaLab;

import java.io.*;

public class Factorial {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = 1, ans = 1;
		System.out.println("Enter number: ");

		try {
			n = Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= n; i++) {
			ans *= i;
		}

		System.out.println("Factorial: " + ans);
	}
}
