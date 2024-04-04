package kms;

class circleclass {
	public int radius;
	public String name;
	public circleclass() {}
	public double getarea() {
		return 3.14 * radius * radius;
	}
}

public class circle2 {
	public static void main(String[] args) {
		circleclass pizza;
		pizza = new circleclass();
		pizza.radius = 3;
		pizza.name = "하와이안피자";
		double area = pizza.getarea();
		System.out.println(pizza.name + ", " + area);
		
		circleclass donut = new circleclass();
		donut.radius = 5;
		donut.name = "크리스피도넛";
		area = donut.getarea(); // 앞에서 double 사용, [데이터 타입이 지정됨]
		System.out.println(donut.name + ", " + area);
	}
}
