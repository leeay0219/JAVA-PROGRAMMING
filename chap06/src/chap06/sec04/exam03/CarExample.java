package chap06.sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.setGas(5);
		boolean gasState = car.isLeftGas();
		if (gasState == true) {
			System.out.println("Start");
			car.run();
		}
		
		if (car.isLeftGas()) {
			System.out.println("No need to fuel up");
		} else {
			System.out.println("Need to fuel up");
		}
	}
}
