public class Administrator {

	int adminId;
	String name;

	public Administrator(int adminId, String name) {
		this.adminId = adminId;
		this.name = name;

	}

	public void addMember(Library libr, Member mem) {
		libr.members.add(mem);
		System.out.println("Member added by: " + name + "(admin)");

	}

	public void removeMember(Library libr, Member mem) {
		if (libr.members.remove(mem)) {
			System.out.println(mem.name + " Removed by: " + name + "(admin)");
		} else {
			System.out.println("Member Not Found");
		}
	}

	public void viewReports(Library libr) {

		System.out.println("Library Report: ");
		System.out.println("Number of Books "+libr.books.size());
		System.out.println("Number of Members "+libr.members.size());

	}

}
