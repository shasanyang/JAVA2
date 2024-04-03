package report2;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
        char input = scanner.next().charAt(0);
        
        for (char c = input; c >= 'a'; c--) {
            for (char ch = 'a'; ch <= c; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        
        scanner.close();
	}
}