package kms;

public class circle3 {
	public static void main(String[] args) {
		circleclass pizza;
		pizza = new circleclass();
		pizza.radius = 10;
		pizza.name = "하와이안피자";
		double area = pizza.getarea();
		System.out.println(pizza.name + ", " + area);
		
		circleclass donut = new circleclass();
		donut = new circleclass();
		donut.radius = 10;
		donut.name = "하와이안피자";
		area = donut.getarea();
		System.out.println(donut.name + ", " + area);
	}
}
