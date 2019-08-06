package chap07.sec01.exam01;

public class CellPhone {
	String model; 
	String colour;
	
	void powerOn() {
		System.out.println("power on");
	}
	
	void powerOff() {
		System.out.println("power off");
	}
	
	void bell() {
		System.out.println("bell ringing");
	}

	void sendVoice(String message) {
		System.out.println("me: " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("you: " + message);
	}
	
	void hangUp() {
		System.out.println("end call");
	}
	
	
	
}
