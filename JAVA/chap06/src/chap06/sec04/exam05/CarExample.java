package chap06.sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed(); 
		System.out.println("Current speed = " + speed + "km/h"); 
	}

}
