package javaLab;

import java.io.IOException;

public class Vowels {

	public static void main(String[] args) {
		char ch = '\u0000';
		
		System.out.println("Enter character: ");
		try {
			ch = (char) System.in.read();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		
		switch (ch) {
		case 'A', 'E', 'I', 'O', 'U':
		case 'a', 'e', 'i', 'o', 'u':
			System.out.println(ch + " is an Vowel.");
			break;
		default:
			System.out.println(ch + " is not an Vowel.");
		}
		
	}
}
