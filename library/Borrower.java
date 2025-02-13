package library;

import java.util.ArrayList;

public class Borrower {
	String name;
	ArrayList<Book> pinjam = new ArrayList<Book>();
	
	public Borrower(String name) {
		this.name = name;
	}
	
	public void displayBorrowedBooks() {
		System.out.println(this.name + "'s Borrowed Books: ");
		for (Book book : pinjam) {
			book.printBook();
		}
	}
	
//	public void addBook(Book book) {
//		pinjam.add(book);
//	}
	
}
