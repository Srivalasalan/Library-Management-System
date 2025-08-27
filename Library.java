public interface Library {

    void addBook(Book b);
    void addMember(Member m);
    void issueBook(int bookId,int memberId);
    void returnBook(int bookId,int memberId);
    void searchBook(String title);
    void displayBooks();
    void displayMembers();
    
}
