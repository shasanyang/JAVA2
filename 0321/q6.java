package kms2;

import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 사이 정수 입력 >> ");
		int num = scanner.nextInt();
		
		if ((num / 10 == 3) && (num % 10 == 3 || num % 10 == 6 || num % 10 == 9)) {
			System.out.println("박수짝!짝!");
		}
		else if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
			System.out.println("박수짝!");
		}
		else 
			System.out.println(num);
		
		scanner.close();
	}
}
