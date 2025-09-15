public class Librarian {

	int librarianId;
	String name;

	public Librarian(int librarianId, String name) {

		this.librarianId = librarianId;
		this.name = name;

	}

	public void addBook(Library lib, Book book) {

		lib.addBook(book);
		System.out.println("Book added added by " + name);

	}

	public void removeBook(Library lib, Book book) {
		if (lib.books.remove(book)) {
			System.out.println("Book Removed By " + name);
		} else {
			System.out.println("Book not Found");
		}

	}

	public void issueBook(Book book, Member mem) {
		mem.borrowBook(book);

	}

	public void returnBook(Book book, Member mem) {
		mem.returnBook(book);
	}

}
