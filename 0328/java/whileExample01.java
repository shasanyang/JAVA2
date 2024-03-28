package kms;

import java.util.Scanner;

public class whileExample01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0, sum = 0;
		System.out.print("정수 입력 : ");
		int n = scanner.nextInt();
//		while (n != -1) {
//			sum += n;
//			count += 1;
//			n = scanner.nextInt();
//		}
		for (;n != -1;) { // 조건만 존재, while과 동일 (그냥 이럴땐 while 쓰자)
			sum += n;
			count += 1;
			n = scanner.nextInt();
		}
		if (count == 0)
			System.out.println("정수 입력되지 않음");
		else
			System.out.println("입력된 정수 개수 : " + count + ", 정수의 평균 값 : " + (double)sum/count);
		
		scanner.close();
	}
}
