

import java.util.Date;

public class Transaction {

	int transactionId;
	Date date;
	Book b;
	Member m;
	
	public Transaction(int transactionId, Book b, Member m) {
		
		this.transactionId = transactionId;
		this.b = b;
		this.m = m;
		this.date = new Date();
		
	}
	
	
}
