
import java.util.LinkedList;

public class Library {

	LinkedList<Book> books = new LinkedList<Book>();
	LinkedList<Member> members = new LinkedList<Member>();
	

	

	public void searchBook(String title) {
		for(Book b: books) {
			if(b.title.equalsIgnoreCase(title)) {
				System.out.println("Book Found! ");
				System.out.println("Book Name: "+ b.title +" Author: "+ b.author);
			}
			else {
				System.out.println("Book Not Found");
			}
		}
	}

	public void getAvailableBook() {

		for(Book b : books) {
			if(!b.issued) {
				System.out.println("Available Books: \n"+b.title);
			}
		}
	}

	public void addBook(Book book) {
 		books.add(book);
		System.out.println(book.title+" Book added");

	}
}
