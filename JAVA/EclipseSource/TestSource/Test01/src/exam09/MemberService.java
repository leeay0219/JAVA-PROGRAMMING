package exam09;

public class MemberService {
	String id; 
	String password; 
	
	public MemberService() {
		// TODO Auto-generated constructor stub
	}

	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true; 
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃되었습니당");
	}
}
