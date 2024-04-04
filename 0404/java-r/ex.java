package kms;
class staticsample {
	public int n;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static int m;
	public static void f() {
		m = 5;
	}
}
public class ex {
	public static void main(String[] args) {
		staticsample s1, s2;
		s1 = new staticsample();
		s1.n = 5;
		s1.g();
		s1.m = 50; // staticsample
		s2 = new staticsample();
		s2.n = 8;
		s2.h();
		s2.f();
		System.out.println(s1.m);
	}
}
