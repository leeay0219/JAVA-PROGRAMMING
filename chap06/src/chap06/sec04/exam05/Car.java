package chap06.sec04.exam05;

public class Car {
	int speed; 
	int getSpeed() {
		return speed; 
	}
	
	void keyTurnOn() {
		System.out.println("Turn On the Key");
	}
	
	void run() {
		for (int i=10; i<=50; i+=10) {
			speed = i; 
			System.out.println("Running. (km/h: " + speed + "km/h)");
		}
	}
}
