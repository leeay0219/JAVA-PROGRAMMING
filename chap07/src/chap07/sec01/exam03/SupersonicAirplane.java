package chap07.sec01.exam03;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1; 
	public static final int SUPERSONIC = 2; 
	
	public int flyMode = NORMAL; 
	
	@Override //fly() 재정의
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("Flying Supersonic"); 
		} else {
			super.fly(); 
		}
	}
}
