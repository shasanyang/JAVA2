package kms;

public class referencepassing {
	public static void increase(circleconst m) {
		m.radius = m.radius + 10;
	}
	public static void main(String[] args) {
		circleconst pizza = new circleconst();
		
		pizza.radius = 10;
		
		increase(pizza);
		
		System.out.println(pizza.radius);
	}
}
