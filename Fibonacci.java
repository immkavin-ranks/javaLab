package javaLab;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number: ");

		int n = in.nextInt();
		in.close();

		int a = 0, b = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			int temp = a;
			a = b;
			b = temp + a;
		}
	}
}
