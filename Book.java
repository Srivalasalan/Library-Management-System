import java.util.ArrayList;

public class Book implements Library {

    ArrayList<Book> books= new ArrayList<>();
    int bookId;
    String title;
    String author;
    int quantity;
    Member m;
    Admin a;

    Book( int bookId,String title,String author,int quantity,Member m,Admin a){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.quantity=quantity;
        this.m=m;
        this.a=a;
    }

   public void addBook(Book b,int id,String pass,Admin a){

    if(this.a==null){
        

    }

    if (id==a.id && pass.equals(a.pass)) {

        books.add(b);
        System.out.println("Book Added Successfully");
 
    }
    else{
        try{
            throw new InvalidCredentialException();
        }
        catch(InvalidCredentialException e){
            System.out.println("Wrong Credentials");
        }
    }

    }

    public void addMember(Member m,int id){

    }

    public  void issueBook(int bookId,int memberId){

    }

    public void returnBook(int bookId,int memberId){

    }

    public void searchBook(String title){

    }

    public void displayBooks(){

    }

    public void displayMembers(){

    }

  



}
