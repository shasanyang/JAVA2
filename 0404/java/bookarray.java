package kms;

import java.util.Scanner;

public class bookarray {
	public static void main(String[] args) {
		book [] book = new book[2];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++) {
//			System.out.print("제목 : ");
//			String.title = scanner.nextLine();
//			System.out.print("저자 : ");
//			String.author = scanner.nextLine();
//			book[i] = new book(title, author);
			
			book[i] = new book();
			System.out.print("제목 : ");
			book[i].title = scanner.nextLine();
			System.out.print("저자 : ");
			book[i].author = scanner.nextLine();
		}
		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i].title + ", " + book[i].author);
		}
		scanner.close();
	}
}
