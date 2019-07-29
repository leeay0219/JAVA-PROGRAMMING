package chap08.sec02.exam03;

public class MemberService {
	public MemberDao memberDao;
	
	public void join() {
		memberDao.insert();
	}
	public void unjoin() {
		memberDao.delete(); 
	}
	public void getMemberInfo() {
		memberDao.select();
	}
	public void modifyMember() {
		memberDao.update();
	}
}
