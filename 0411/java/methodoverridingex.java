package kms;

class shape {
	public shape next;
	public shape() { next = null; }
	public void draw() {
		System.out.println("shape");
	}
}


class line extends shape {
	public void draw() {
		System.out.println("line");
	}
class rect extends shape {
	public void draw() {
		System.out.println("rect");
	}
class circle extends shape {
	public void draw() {
		System.out.println("circle");
	}
}

public class methodoverridingex {
	public static void main(String[] args) {
		shape shape = new shape();
		shape.draw();
		line line = new line();
		line.draw();
		rect rect = new rect();
		rect.draw();
		circle circle = new circle();
		circle.draw();
		shape s1 = new line();
		
		s1.draw();
	}
}
