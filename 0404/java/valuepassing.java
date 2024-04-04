package kms;

public class valuepassing {
	public static void increase(int m) {
		m = m+1;
	}
	public static void main(String[] args) {
		int n = 10;
		
		increase(n);
		
		System.out.println(n);
	}
}
