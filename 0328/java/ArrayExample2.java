package kms;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("intArray[" + i + "] = ");
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}
		for (int num : intArray)
			sum += num;
		System.out.println("배열의 합 : " + sum + ", 배열의 평균 : " + (double)sum/intArray.length);
	}
}
