package C6.Method;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean result = ms.login("hong", "12345");
		if (result) {
			System.out.println("logged in");
			ms.logout("hong");
		} else {
			System.out.println("wrong id/pw"); 
		}
	}

}
