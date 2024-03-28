package kms;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayExample01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
//		int max = -2147483648;
//		int min = 2147483648;
		
		int max = 0, min = 0;
//		intArray[0] = scanner.nextInt();
//		min = max = intArray[0];
		
		System.out.print("정수 5개 입력 : ");
		for (int i = 1; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			if (i == 0)
				min = max = intArray[0];
			else {
				if (intArray[i] > max)
					max = intArray[i];
				if (intArray[i] < min)
					min = intArray[i];
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		scanner.close();
	}
}
