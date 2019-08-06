package chap11.sec01.exam01;

public class Member {
	private String id;
	public Member (String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) { //Object객체, 자식객체 가능
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true; 
			}
		}
		return false; 
	}
}
