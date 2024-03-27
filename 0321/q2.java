package kms2;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int i = scanner.nextInt();
		
		if (i / 10 == i % 10) {
			System.out.println("10의 자리와 1의 자리가 같다.");
		}
		else {
			System.out.println("불일치");
		}
		scanner.close();
	}
}
