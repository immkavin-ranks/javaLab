package javaLab;

import java.util.Scanner;

public class SumOfFirstN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		
		scanner.close();
		
		int sum = n * (n + 1) / 2;
		
		System.out.println(sum);
	}
}
