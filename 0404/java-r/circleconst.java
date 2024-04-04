package kms;

public class circleconst {
	int radius;
	String name;
	
	public circleconst() {
		radius = 5;
		name = "";
	}
	public circleconst(int radius, String name) {
		super();
		this.radius = radius;
		this.name = name;
	}
	public double getarea() {
		return 3.14 * radius * radius;
	}
	public static void main(String[] args) {
		circleconst pizza = new circleconst(10, "none피자");
		System.out.println(pizza.name + ", " + pizza.getarea());
		
		circleconst donut = new circleconst(20, "no도넛");
		System.out.println(donut.name + ", " + donut.getarea());
	}
	
}
