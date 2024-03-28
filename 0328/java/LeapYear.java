package kms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year;
		do { // 무한반복 : for(;;), while(true), do {...} while(true)
			System.out.print("년도를 입력하세요 >> ");
			year = scanner.nextInt();
			if(year == 0) // for문 빠져나가는 구문
				break;
			
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println(year + "년은 윤년(leap year)입니다.");
			}
			else {
				System.out.println(year + "년은 평년(common year)입니다.");
			}
		}while(true);
		scanner.close();
	}
}