package kms2;

import java.util.Scanner;

public class q9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력 : ");
		double cx = scanner.nextDouble();
		double cy = scanner.nextDouble();
		double cz = scanner.nextDouble();
		System.out.print("점 입력 : ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
        boolean insideCircle = isInsideCircle(x, y, cx, cy, cz);

        if (insideCircle) {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
        } else {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 없다.");
        }

        scanner.close();
    }

    // 점이 원의 내부에 있는지를 판별하는 메소드
    public static boolean isInsideCircle(double x, double y, double cx, double cy, double cz) {
        double distance = Math.sqrt(Math.pow(x - cx, 2) + Math.pow(y - cy, 2));
        return distance <= cz;
	}
}
