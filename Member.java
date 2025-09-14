
import java.util.LinkedList;

public class Member {

	int memberId;
	String name;
	long contact;
	LinkedList<Book> books = new LinkedList<Book>();

	public Member(int memberId, String name, long contact, Book b) {

		this.memberId = memberId;
		this.name = name;
		this.contact = contact;
	}

	public void borrowBook(Book book) {

		if (!book.issued) {
			book.issue();
			books.add(book);
			System.out.println(name + " Borrowed: " + book.title);
		} else {
			System.out.println("Book Not Available");
		}

	}

	public void returnBook(Book book) {

		if (books.remove(book)) {
			book.returnBook();
			System.out.println(name + "has Returned " + book.title);

		} else {
			System.out.println("You don't buy this book");
		}

	}

	public void reserveBook(Book book) {
		book.reserve();
	}

}
