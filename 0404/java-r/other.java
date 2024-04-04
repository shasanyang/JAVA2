package kms;

public class other {
	public static int getsum(int i, int j) {
		return i + j;
	}
	public static int getsum(int i, int j, int k) {
		return i + j + k;
	}
	public static double getsum(double i, double j) {
		return i + j;
	}
	public static double getsum(double i, int j) {
		return i + j;
	}
	public static double getsum(int i, double j) {
		return i + j;
	}
	public static void main(String[] args) {
		System.out.println(getsum(1, 2));
		System.out.println(getsum(1, 2, 3));
		System.out.println(getsum(1.5, 2.5));
		System.out.println(getsum(1.5, 2));
		System.out.println(getsum(1, 2.5));
		
	}
}
