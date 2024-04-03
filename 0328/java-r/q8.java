package report2;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("정수 몇 개? ");
        int size = scanner.nextInt();
        if (size >= 100) {
            System.out.println("100보다 작은 개수를 입력하세요.");
            return;
        }
        
        int[] numbers = new int[size];
        boolean[] used = new boolean[101];
        
        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < size; i++) {
            int randomNum;
            do {
                randomNum = (int)(Math.random() * 100) + 1;
            } while (used[randomNum]);
            numbers[i] = randomNum;
            used[randomNum] = true;
            System.out.print(numbers[i] + " ");
        }
        
        scanner.close();
	}
}
