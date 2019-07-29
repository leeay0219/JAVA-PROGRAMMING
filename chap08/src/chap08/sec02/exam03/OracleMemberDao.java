package chap08.sec02.exam03;

public class OracleMemberDao implements MemberDao {
	public void insert() {
		System.out.println("Insert in Oracle");
	}
	public void select() {
		System.out.println("Select from Oracle");
	}
	public void update() {
		System.out.println("Update on Oracle");
	}
	public void delete() {
		System.out.println("Delete from Oracle");
	}
	
}
