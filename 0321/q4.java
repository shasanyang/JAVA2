package kms2;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력 >> ");
		int i1 = scanner.nextInt();
		int i2 = scanner.nextInt();
		int i3 = scanner.nextInt();
		
		int middle;

        if ((i1 >= i2 && i1 <= i3) || (i1 <= i2 && i1 >= i3)) {
            middle = i1;
        } else if ((i2 >= i1 && i2 <= i3) || (i2 <= i1 && i2 >= i3)) {
            middle = i2;
        } else {
            middle = i3;
        }
        System.out.println(middle);
        
		scanner.close();
	}
}
