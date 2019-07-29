package chap08.sec02.exam03;

public class Example {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		memberService.memberDao = new OracleMemberDao();
		memberService.join(); 
		memberService.getMemberInfo();
		memberService.memberDao = new MySQLMemberDao(); 
		memberService.modifyMember();
		memberService.unjoin();
	}

}
