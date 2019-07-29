package chap08.sec02.exam03;

public class MySQLMemberDao extends OracleMemberDao {
	@Override
	public void insert() {
		System.out.println("Insert in MySQL");
	}
	@Override
	public void select() {
		System.out.println("Select from MySQL");
	}
	@Override
	public void update() {
		System.out.println("Update on MySQL");
	}
	@Override
	public void delete() {
		System.out.println("Delete from MySQL");
	}
}
