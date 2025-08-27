public class Book {
    int bookId;
    String title;
    String author;
    int quantity;
    Member m;

    Book( int bookId,String title,String author,int quantity,Member m){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.quantity=quantity;
        this.m=m;
    }
}
