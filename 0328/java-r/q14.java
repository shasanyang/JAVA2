package report2;

import java.util.Scanner;

public class q14 {
	public static void main(String[] args) {
		String[] course = {"java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("과목 이름>> ");
            input = scanner.nextLine();
            
            if (input.equals("그만")) {
                break;
            }
            
            boolean found = false;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(input)) {
                    System.out.println(input + "의 점수는 " + score[i]);
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("없는 과목입니다.");
            }
        }
        
        scanner.close();
    }
}