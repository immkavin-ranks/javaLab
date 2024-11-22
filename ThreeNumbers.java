package javaLab;

public class ThreeNumbers {
	
	public static void main(String[] args ) {
		int a = 5, b = 7, c = 1;
		
		int ans = a;
		
		if (b > ans)
			ans = b;
		if (c > ans)
			ans = c;
		
		System.out.println(ans);
			
	}
}
