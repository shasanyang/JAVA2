package kms2;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 점 : ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("두 번째 점 : ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		if (inRect(x1, y1, 100, 100, 200, 200)) {
            System.out.println("두 직사각형 충돌함");
        } else {
            System.out.println("두 직사각형 충돌하지 않음");
        }
        scanner.close();
    }

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
  		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
  		return true;
  		else
 		return false;
  	}
}