package kms2;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int money = scanner.nextInt();
		for (int i = 0; i < unit.length; i++) {
			int count = money / unit[i];
			money %= unit[i];
			System.out.println(unit[i] + "원 짜리 : " + count + "개 ");
		}
		
		scanner.close();
	}
}