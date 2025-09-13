package pro1;

public class Book {

	int bookId;
	String title;
	String author;
	boolean issued = false;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	public void issue() {
		
		if(!issued) {
			issued=true;
			System.out.println("Book issued: "+ title);
		}
		else {
			System.out.println("Book not issued");
		}

	}

	public void reserve() {
		if(!issued) {
			System.out.println("Book Reserved: "+title);
			
		}
		else {
			System.out.println("Book cannot be reserved or it have already issued ");
		}

	}

	public void returnBook() {
		if(issued) {
			issued=false;
			System.out.println("Book has Been Returned");
		}
		else {
			System.out.println("Book has not returned Yet.");
		}

	}

	public void updateStatus() {
		System.out.println("Book Status , Issued: "+issued);
	}

}
