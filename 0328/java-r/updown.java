package report2;

import java.util.Random;
import java.util.Scanner;

public class updown {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
        
        int maxNumber = 100;
        
        boolean playAgain = true;
        while (playAgain) {
	        int randomNumber = random.nextInt(maxNumber) + 1;
	        
	        int guess;
	        int attempts = 0;
	        boolean guessedCorrectly = false;
	        
	        System.out.println("1부터 " + maxNumber + "까지의 숫자를 맞춰보세요.");
	        
	        while (!guessedCorrectly) {
	            System.out.print("추측한 숫자를 입력하세요: ");
	            guess = scanner.nextInt();
	            attempts++;
	            
	            if (guess == randomNumber) {
	                guessedCorrectly = true;
	                System.out.println("축하합니다! 숫자 " + randomNumber + "을(를) 맞추셨습니다.");
	                System.out.println("시도한 횟수: " + attempts);
	            } else if (guess < randomNumber) {
	                System.out.println("업! 더 큰 숫자입니다.");
	            } else {
	                System.out.println("다운! 더 작은 숫자입니다.");
	            }
	        }
	        System.out.print("게임을 다시 하시겠습니까? (yes/no): ");
	        String playAgainInput = scanner.next().toLowerCase();
	        playAgain = playAgainInput.equals("yes") || playAgainInput.equals("y");
	    }
        
        scanner.close();
    }	
}
