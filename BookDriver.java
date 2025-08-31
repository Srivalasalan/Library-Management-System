import java.util.Scanner;

public class BookDriver {
    
    public static void main(String[] args) {
        Book b1 = new Book(0, null, null, 0, null, null );
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        
        while (exit) {

            System.out.println("0.Admin Login \n1.Add Book \n2.Add Member \n3.issue Book \n4.Return Book \n5.Search Book \n6.Display Book \n7.Display Members \n8.Exit");
            System.out.print("Enter your Choice: ");
            int opt = scan.nextInt();

            switch (opt) {
                case 0:{
                    System.out.println("Enter Your Admin id: ");
                    int id=scan.nextInt();
                    System.out.println("Enter Your Admin Password: ");
                    String pass =scan.next();
                    b1.addBook(b1, id, pass, new Admin(id, pass));
                    

                }
                case 1:{
                    System.out.println("Enter Your Admin id: ");
                    int id=scan.nextInt();
                    System.out.println("Enter Your Admin Password: ");
                    String pass =scan.next();
                     System.out.print("Enter book ID: ");
                    int Bid = scan.nextInt();
                    
                    System.out.print("Enter title: ");
                    String title = scan.nextLine();

                    System.out.print("Enter author: ");
                    String author = scan.nextLine();

                    System.out.print("Enter quantity: ");
                    int qty = scan.nextInt();

                    b1.addBook(new Book(Bid, title, author, qty, null, null), id, pass, new Admin(id, pass));
                   
                }
                    
                    break;

                case 2:{
                    System.out.println("Enter Your Member Id: ");
                    int id = scan.nextInt();
                    System.out.println("Enter Your Name: ");
                    String name = scan.next();
                    System.out.println("Enter Your Contact No: ");
                    String cno=scan.next();
                    b1.addMember(new Member(id, name, cno), id);
                }break;

                case 3:{

                    System.out.println("Enter Book id: ");
                    int Bid= scan.nextInt();
                    System.out.println("Enter Member id: ");
                    int Mid=scan.nextInt();
                    b1.issueBook(Bid, Mid);

                }break;

                case 4:{
                     System.out.println("Enter Book id: ");
                    int Bid= scan.nextInt();
                    System.out.println("Enter Member id: ");
                    int Mid=scan.nextInt();
                    b1.returnBook(Bid, Mid);

                }break;

                case 5:{

                    System.out.println("Enter Book Title: ");
                    String title=scan.next();
                    b1.searchBook(title);

                }break;

                case 6:{

                    b1.displayBooks();

                }break;

                case 7:{
                    b1.displayMembers();
                }break;
                case 8:{
                    exit=false;
                }break;


            
                default:{
                    System.out.println("Enter Valid Choice: ");

                }
                    break;
            }
        }

    }
}
