package chap08.sec01.exam01;

public class Example { // 다형성 

	public static void main(String[] args) {
		Television tv = new Television(); 
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		Audio audio = new Audio(); 
		rc = audio; 
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff(); 
		
		use(tv);
		use(audio); 
	}
	
	public static void use(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}

}
