package library;

public class Book {
	String title;
	String isbn;
	Author author;
	
	public Book(String title, String isbn, Author author) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}
	
	public void printBook() {
		System.out.println("Books in Library: ");
		System.out.println("Title: " + title);
		System.out.println("ISBN: " + isbn);
		System.out.println("Author: " + author.name);
		System.out.println("Biography: " + author.biograph);
		System.out.println("-----------------------------------------------");
	}
}
