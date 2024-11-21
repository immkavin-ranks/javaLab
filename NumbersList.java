package javaLab;

import java.util.Arrays;

public class NumbersList {

	public static void main(String[] args) {

		int[] numbers = { 42, 17, 99, 5, 63, 11, 30, 7, 55, 23 };

		for (int i = 0; i < numbers.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (numbers[i] > numbers[j]) {
		            int temp = numbers[i];
		            numbers[i] = numbers[j];
		            numbers[j] = temp;
		        }
		    }
		}

		System.out.println(Arrays.toString(numbers));
	}
}
