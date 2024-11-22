package javaLab;

public class LeapYear {
	public static void main(String [] args) {
		int year1 = 2004, year2 = 2002;
		
		System.out.println(isLeapYear(year1));
		System.out.println(isLeapYear(year2));
	}
	
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
