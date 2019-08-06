package chap06.sec03.exam05;

public class Calendar {
	static Calendar singleton = new Calendar();
	private Calendar() {
		
	}
	
	public static Calendar getInstance() {
		return singleton; 
	}
}
