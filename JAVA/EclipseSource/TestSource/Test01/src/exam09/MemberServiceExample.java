package exam09;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("�α��εǾ����ϴ�");
			memberService.logout("hong");
		} else {
			System.out.println("id / password Ʋ��"); 
			
		}
				
	}

}
