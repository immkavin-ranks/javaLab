package javaLab;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, digits, digit = 0, accumulator = 0;

		System.out.println("Enter number: ");

		n = in.nextInt();
		in.close();

		digits = String.valueOf(n).length();

		int i = n;
		while (i > 0) {
			digit = i % 10;
			i /= 10;
			accumulator += Math.pow(digit, digits);
		}

		if (n == accumulator) {
			System.out.println(n + " is an Armstrong number.");
		} else {
			System.out.println(n + " is not an Armstrong number.");
		}
	}
}
