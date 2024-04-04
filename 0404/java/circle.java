package kms;

public class circle {
	public int radius;
	public String name;
	
	public circle() { // 생성자
		
	}
	public double getArea() { // 계산 메소드
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		circle pizza;
		pizza = new circle();
		pizza.radius = 3;
		pizza.name = "하와이안피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + ", " + area);
		
		circle donut = new circle();
		donut.radius = 5;
		donut.name = "크리스피도넛";
		area = donut.getArea(); // 앞에서 double 사용, [데이터 타입이 지정됨]
		System.out.println(donut.name + ", " + area);
	}
}
