package javaLab;

public class SampleString {

	public static void main(String[] args) {
		String str1 = "Rock";
		String str2 = "Star";

		String str = str1.concat(str2);

		System.out.println("Length of String: " + str.length());
		System.out.println();
		System.out.println("Character at position 5: " + str.charAt(5));
		System.out.println("Index of character 'S': " + str.indexOf('S'));
		System.out.println("Contains sequence 'tar': " + str.contains("tar"));
		System.out.println("EndsWith character 'r': " + str.endsWith("r"));
		System.out.println("Replace 'Rock' with 'Duke': " + str.replace("Rock", "Duke"));
		System.out.println("Convert to LowerCase: " + str.toLowerCase());
		System.out.println("Convert to UpperCase: " + str.toUpperCase());

	}
}
