package kms;

class circlearray {
	int radius;
	public circlearray(int radius) {
		this.radius = radius;
	}
	public double getarea() {
		return 3.14 * radius * radius;
	}
}

public class circlearraytest {
	public static void main(String[] args) {
		circlearray [] c = new circlearray[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = new circlearray(i);
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getarea());
		}
	}
}
