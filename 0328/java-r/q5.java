package report2;

import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];
        
        System.out.print("양의 정수 10개를 입력하시오>> ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("3의 배수는 ");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
        
        scanner.close();
	}
}