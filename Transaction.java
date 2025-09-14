import java.time.LocalDate;


public class Transaction {

	int transactionId;
	LocalDate date;
	Book b;
	Member m;

	public Transaction(int transactionId, Book b, Member m) {

		this.transactionId = transactionId;
		this.b = b;
		this.m = m;
		this.date = LocalDate.now();

	}

	public void create() {
		
		System.out.println("The Transaction is created for the Book"+b.title + " and for the Member: "+m.name);
		System.out.println("Date: "+ date);
	}

	public void update(Book newBook) {
		this.b=newBook;
		System.out.println("The new Book is updated , Book Name: "+newBook);

	}

	public void delete() {
		System.out.println("Transaction has been Deleted for Book: "+b.title+ " and for "+m.name);
		this.b=null;
		this.m=null;

	}

}
