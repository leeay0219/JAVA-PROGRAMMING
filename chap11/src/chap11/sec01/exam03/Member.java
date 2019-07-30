package chap11.sec01.exam03;

public class Member {
	private String id; 
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
