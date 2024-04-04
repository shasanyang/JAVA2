package kms;

class calc {
	static int abs(int a) {
		return (a > 0)?a:-a;
	}
	static int max(int a, int b) {
		return (a > b)?a:b;
	}
	static int min(int a, int b) {
		return (a > b)?b:a;
	}
}
public class calcex {
	public static void main(String[] args) {
		System.out.println(calc.abs(-5));
		System.out.println(calc.max(1, 2));
		System.out.println(calc.min(1, 2));
	}
}
