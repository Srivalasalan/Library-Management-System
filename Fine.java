
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Fine {
	
	int fineId;
	double amount;
	Date dueDate;
	
	
	public Fine(int fineId, double amount,Date dueDate) {
		this.fineId = fineId;
		this.amount = amount;
		this.dueDate = dueDate;
		
		
	}
	
	
	public void generateFine(LocalDate returnDate,Book book) {
		if(returnDate.isAfter(book.dueDate)) {
			long daysLate=ChronoUnit.DAYS.between(book.dueDate, returnDate);
			amount =daysLate*amount;
			System.out.println("Fine Amount: "+amount);
		}
		
	}
	
	public void payFine(double amount) {
		
		if(amount>0&&amount==this.amount) {
			System.out.println("Fine Paid Successfully!");
			amount=0;
		}
		else {
			System.out.println("Fine Not Paid");
			
		}
		
	}
	
	

}
