package kms2;

import java.util.Scanner;

public class q12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산 >> ");
        double num1 = scanner.nextDouble();
        String operator = scanner.next();
        double num2 = scanner.nextDouble();
        
        double result = 0.0;
        if (operator.equals("+")) {
            result = num1 + num2;
        } 
        else if (operator.equals("-")) {
            result = num1 - num2;
        } 
        else if (operator.equals("*")) {
            result = num1 * num2;
        } 
        else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }
            result = num1 / num2;
        } 
        else {
            System.out.println("올바른 연산자가 아닙니다.");
            return;
        }
        System.out.println(num1 + operator + num2 + "의 계산 결과는 " + result);
        
        scanner.close();
	}
}