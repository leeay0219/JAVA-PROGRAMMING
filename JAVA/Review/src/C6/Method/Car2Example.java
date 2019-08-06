package C6.Method;

public class Car2Example {

	public static void main(String[] args) {
		Car2 car = new Car2(); 
		car.keyOn();
		car.run();
		int speed = car.getSpeed();
		System.out.println("cur speed: " + speed); 
	}

}
