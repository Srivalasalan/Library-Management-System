public interface Library {

    void addBook(Book b, int id, String pass,Admin a);
    void addMember(Member m, int id);
    void issueBook(int bookId,int memberId);
    void returnBook(int bookId,int memberId);
    void searchBook(String title);
    void displayBooks();
    void displayMembers();
    
}
