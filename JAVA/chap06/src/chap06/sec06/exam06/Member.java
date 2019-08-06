package chap06.sec06.exam06;

public class Member {
	private String mid;
	private String nation = "Hello";
	
	public void setMid(String mid) {
		if (mid.length()>=8) {
			this.mid = mid;
		} else {
			System.out.println("Must be over 8 characters");
		}
	}
	public String getMid() {
		String front = mid.substring(0, 5);
		for (int i=5; i<mid.length(); i++) {
			front += "*";
		}
		return front; 
	}
	public String getNation() {
		return nation;
	}
}
