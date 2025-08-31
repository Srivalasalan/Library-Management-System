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

   public void addBook(Book b,int,Admin a){

    if(this.a==null){
        this.a=a;
        System.out.println("Welcome Admin");
        return;
    }
    else{
        try {
            throw new NoAdminException();
            
        } catch (NoAdminException e) {
           System.out.println("No Admin Yet!");
        }
       
    }

    if (id==a.id && pass.equals(a.pass)) {

        books.add(b);
        System.out.println("Book Added Successfully");
        return;
    }
    else{
        try{
            throw new InvalidCredentialException();
        }
        catch(InvalidCredentialException e){
            System.out.println("Wrong Credentials");
        }
        return;
    }

    }

    public void addMember(Member m,int id){

        if (m.memberId!=id) {
            try {
                throw new NotAMemberException();
            } catch (NotAMemberException e) {
                System.out.println("You're Not a Member");
            }
            return;
            
        } else {
            System.out.println("Welcome Member: "+this.m.name);
            this.m.mem.add(m);
           
           return; 
        }



    }

    public  void issueBook(int bookId,int memberId){

       for (Book book : books) {
        if(book.bookId==bookId){
            System.out.println("Book issued Successfully");
            book.quantity--;
            return;
        }
        else{
            System.out.println("Book Not Available");
            return;
        }
        
       }
       System.out.println("Book Id not found!");

    }

    public void returnBook(int bookId,int memberId){

        for(Book b:books){
            if (b.bookId==bookId&&m.memberId==memberId) {
                System.out.println("Book returned Successfully");
                b.quantity++;
                return;
            } else {
                System.out.println("Book Id Not Found");
                
            }
            return;
        }

    }

    public void searchBook(String title){

        for(Book b: books){
            if(title.equalsIgnoreCase(b.title)){
                System.out.println("Book Found ");
                System.out.println("Book Name: "+b.title);
                System.out.println("Quantity: "+b.quantity);
                
            }
            else{
                System.out.println("Book not found");
                return;
            }
        }

    }

    public void displayBooks(){

        if(books.isEmpty())
            System.out.println("No Books Available");
        for(Book b: books){
            System.out.println("Book Id: "+b.bookId +"\nTitle: "+b.title+ "\nAuthor: "+b.author+"\nQuantity: "+b.quantity);
        }

    }

    public void displayMembers(){
        if (m.mem.isEmpty()) {
            System.out.println("No Members Available");
        }
        for(Member members:m.mem){
            System.out.println("Member Id: "+members.memberId+"\nName: "+members.name+"\nContact Info: "+members.contactInfo);

        }

    }

  



}
