import java.util.ArrayList;

public class Member {
    ArrayList<Member> mem=new ArrayList<>();
    int memberId;
    String name;
    String contactInfo;

    Member(int memberId,String name,String contactInfo){
        this.memberId=memberId;
        this.name=name;
        this.contactInfo=contactInfo;
    }
    
}
