package C6.Method;

public class Car2 {
	int speed; 
	
	int getSpeed() {
		return speed; 
	}
	
	void keyOn() {
		System.out.println("Key on");
	}
	
	void run() {
		for (int i=10; i<=50; i+=10) {
			speed = i; 
			System.out.println("running.. speed: " + speed);
		}
	}
}
