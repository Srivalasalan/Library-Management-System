public interface Library {

    void addBook(Admin a);
    void addMember(Member m, int id);
    void issueBook(int bookId,int memberId);
    void returnBook(int bookId,int memberId);
    void searchBook(String title);
    void displayBooks();
    void displayMembers();
    
}
