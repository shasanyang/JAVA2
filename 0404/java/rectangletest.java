package kms;

import java.util.Scanner;

//class rectangle {
//	int width, height;
//	int getarea() {
//		return width * height;
//	}
//}
//public class rectangletest {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		rectangle rect = new rectangle();
//		
//		System.out.print("width = ");
//		rect.width = scanner.nextInt();
//		System.out.print("height = ");
//		rect.height = scanner.nextInt();
//		
//		System.out.println(rect.getarea());
//		scanner.close();
//	}
//}

class rectangle {
	int width, height;
	int getarea() {
		return width * height;
	}
}
public class rectangletest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		rectangle rect = new rectangle();
		
		System.out.print("width = ");
		rect.width = scanner.nextInt();
		System.out.print("height = ");
		rect.height = scanner.nextInt();
		
		System.out.println(rect.getarea());
		scanner.close();
	}
}
