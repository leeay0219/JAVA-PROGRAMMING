package chap06.sec05.exam03;

public class Member {
	static String nation = "Korea";
	String mid; 
	String mpassword; 
	
	boolean login(String mid, String mpassword) {
		if (this.mid.equals(mid)) {
			if (this.mpassword.equals(mpassword)) {
			return true;
			}
		}
		return false; 
	}
	
	static String getNation() {
		return nation; 
	}
	//parameter만으로 실행되는 메소드는 static선언
	static int add(int x , int y) {
		return x+y;
	}
}
