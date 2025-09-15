import java.util.Date;
import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Book b1 = new Book(1, "The Lord of the Rings", "J.R.R. Tolkien");
		Book b2 = new Book(2, "The Silent Patient", "Alex Michaelides");
		Library library = new Library();
		Administrator admin = new Administrator(1, "Admin");
		Librarian librarian = new Librarian(101, "Titan");

		library.addBook(new Book(1, "Alchemist", "Paulo Coelho"));
		library.addBook(new Book(2, "Ikigai", "Héctor García and Francesc Miralles"));
		library.addBook(new Book(3, "I Fell Love With Hope", " Lou-Andrea Callewaert"));

		Member member = new Member(201, "Sri", 9876543210L);
		admin.addMember(library, member);

		Fine fine = new Fine(1, 0, new Date());
		boolean exit = true;

		while (exit) {
			System.out.println("1.Book\n2.Member\n3.Library\n4.Librarian\n5.Admin\6.Transaction\n7.Fine\n8.Exit");
			System.out.print("\nEnter Your Choice: ");
			int inp = scan.nextInt();
			switch (inp) {
			case 1: {
				System.out.println("\n1.issue\n2.reserve\n3.returnBook\n4.UpdateStatus");
				System.out.print("Enter Choice: ");
				int choice = scan.nextInt();
				switch (choice) {
				case 1: {
					b1.issue();

				}
					break;
				case 2: {
					b2.reserve();
				}
					break;
				case 3: {
					b1.returnBook();
				}
					break;
				case 4: {
					b1.updateStatus();
				}
					break;
				default: {
					System.out.print("Enter Valid Choice: ");
				}
					break;

				}
			}
				break;

			case 2: {
				System.out.println("1.Borrow Book \n2.Return Book \n3.Reserve Book");
				System.out.print("Enter Your Choice: ");
				int choice = scan.nextInt();
				switch (choice) {
				case 1: {
					member.borrowBook(b1);
				}
					break;
				case 2: {
					member.returnBook(b1);

				}
					break;
				case 3: {
					member.reserveBook(b2);

				}
					break;
				default: {
					System.out.print("Enter a Valid Choice: ");
				}
				}
			}
				break;

			case 3: {
				System.out.println("\n1.Search book\n2.getAvailableBooks\n3.AddBook");
				System.out.print("Enter Your Choice: ");
				int choice = scan.nextInt();
				switch (choice) {
				case 1: {
					System.out.print("\nEnter the Title of the Book: ");
					String bookName = scan.next();
					library.searchBook(bookName);

				}
					break;
				case 2: {
					library.getAvailableBook();
				}
					break;
				case 3: {
					System.out.print("Enter the Book ID: ");
					int bookId = scan.nextInt();
					System.out.print("\nEnter the Title of the Book: ");
					String title = scan.next();
					System.out.print("\nEnter the Author of the Book: ");
					String author = scan.next();
					Book newBook = new Book(bookId, title, author);
					library.addBook(newBook);
				}
					break;

				default: {
					System.out.print("Enter Valid Choice: ");
				}
				}

			}
				break;

			case 4: {
				System.out.println("\n1.Add Book\n2.Remove Book\n3.Issue Book \n4.returnBook");
				System.out.print("Enter Your Choice: ");
				int choice=scan.nextInt();
				switch(choice) {
				case 1:{
					System.out.print("\nEnter the Book ID: ");
					int bookId = scan.nextInt();
					System.out.print("\nEnter the Title of the Book: ");
					String title = scan.next();
					System.out.print("\nEnter the Author of the Book: ");
					String author = scan.next();
					Book newBook = new Book(bookId, title, author);
					librarian.addBook(library, newBook);
					
				}break;
				
				case 2:{
					System.out.print("\nEnter the Book ID: ");
					int bookId = scan.nextInt();
					System.out.print("\nEnter the Title of the Book: ");
					String title = scan.next();
					System.out.print("\nEnter the Author of the Book: ");
					String author = scan.next();
					Book newBook = new Book(bookId, title, author);
					librarian.removeBook(library, newBook);
					
				}break;
				case 3:{
					
					
				}break;
				}
				

			}
				break;

			}
		}
	}

}
