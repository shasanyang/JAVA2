package kms2;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >> ");
		
		int i = scanner.nextInt();
		double m = i / 1100;
		
		System.out.println(i + "원은 $" + m + "입니다.");
		
		scanner.close();
	}
}
