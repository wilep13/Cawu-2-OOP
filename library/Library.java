package library;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> simpan = new ArrayList<Book>();
	
	public Library() {
		
	}
	
	public void addBook(Book book) {
		simpan.add(book);
		System.out.println("Book added to library " + book.title);
	}
	
	public void borrowBook(Borrower peminjam, Book book) {
		peminjam.pinjam.add(book);
		simpan.remove(book);
		System.out.println(peminjam.name + " borrowed: " + book.title);
	}
	
	public void returnBook(Borrower peminjam, Book book) {
		simpan.add(book);
		peminjam.pinjam.remove(book);
		System.out.println(peminjam.name + " returned: " + book.title);
	}
	
	public void displayLibraryBooks() {
		for (Book book : simpan) {
			book.printBook();
		}
		
		
	}
}
