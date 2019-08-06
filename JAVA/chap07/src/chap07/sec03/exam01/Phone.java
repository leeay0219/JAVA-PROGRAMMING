package chap07.sec03.exam01;

public abstract class Phone { //객체생성불가능
	public String owner; 
	public void turnOn() {
		System.out.println("On");
	}
	public void turnOff() {
		System.out.println("Off");
	}
}
