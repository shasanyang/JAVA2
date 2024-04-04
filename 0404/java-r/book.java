package kms;

public class book {
	String title;
	String author;
	public book() {
		this("","");
		
	}
	public book(String title) {
		super();
		this.title = title;
		author = "작가미상";
	}
	public book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		book LP = new book("어린왕자", "생텍쥐베리");
		book LS = new book("춘향전");
		
		System.out.println(LP.title + " " + LP.author);
		System.out.println(LS.title + " " + LS.author);
	}
}
