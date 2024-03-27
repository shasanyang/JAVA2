package kms2;

import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개 입력 >> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
        int max, mid, min;

        if (x > y) {
            if (y > z) {
                max = x;
                mid = y;
                min = z;
            } else if (z > x) {
                max = z;
                mid = x;
                min = y;
            } else {
                max = y;
                mid = z;
                min = x;
            }
        } else {
            if (x > z) {
                max = y;
                mid = x;
                min = z;
            } else if (z > y) {
                max = z;
                mid = y;
                min = x;
            } else {
                max = y;
                mid = z;
                min = x;
            }
        }

        if (max < mid + min) {
            System.out.println("삼각형");
        } else {
            System.out.println("삼각형이 안됨");
        }

        scanner.close();
	}
}
