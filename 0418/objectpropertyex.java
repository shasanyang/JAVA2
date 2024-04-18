package kms;

class point {
	public int x, y;
	public point (int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class rect {
	public int width, height;
	public rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

public class objectpropertyex {
	static void assignvalue(int x, int y) {
		System.out.println("x = " + x + ", y = " + y);
	}
	static void print(Object obj) {
		point subp = (point)obj;
		rect rect;
		if (obj instanceof point) {
			subp = (point)obj;
			System.out.println(subp.x + ", " + subp.y);
		}
		if (obj instanceof rect) {
			rect = (rect)obj;
			System.out.println(rect.width + ", " + rect.height);
		}
		System.out.println(subp.x);
	}
	
	public static void main(String[] args) {
		assignvalue(1, 2);
		point p = new point(2, 3);
		print(p);
		rect r = new rect(5, 6);
		print(r);
	}
}
