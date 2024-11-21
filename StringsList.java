package javaLab;

import java.util.Arrays;

public class StringsList {
	public static void main(String[] args) {
		String[] colors = { "Red", "Blue", "Green", "Yellow", "Purple", "Orange", "Pink", "Brown", "Violet", "Indigo" };

		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < i; j++) {
				if (colors[i].compareTo(colors[j]) < 0) {
					String temp = colors[i];
					colors[i] = colors[j];
					colors[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(colors));
	}
}
