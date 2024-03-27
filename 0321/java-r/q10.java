package kms2;

import java.util.Scanner;

public class q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("첫번째 원 중심 반지름 입력 : ");
		double cx1 = scanner.nextDouble();
		double cy1 = scanner.nextDouble();
		double cz1 = scanner.nextDouble();

		System.out.print("두번째 원 중심 반지름 입력 : ");
		double cx2 = scanner.nextDouble();
		double cy2 = scanner.nextDouble();
		double cz2 = scanner.nextDouble();
	
		boolean overlap = isOverlap(cx1, cy1, cz1, cx2, cy2, cz2);
	
		if (overlap) {
			System.out.println("두 원은 서로 겹친다.");
		} else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		
		scanner.close();
		}
		public static boolean isOverlap(double cx1, double cy1, double cz1, double cx2, double cy2, double cz2) {
			double distance = Math.sqrt(Math.pow(cx2 - cx1, 2) + Math.pow(cy2 - cy1, 2));
			return distance <= cz1 + cz2;
	}
}
