package C6.Method;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.getGas(10);
		
		boolean gasState = car.leftGas(); 
		if (gasState) {
			System.out.println("start");
			car.run();
		} 
		
		if(car.leftGas()) {
			System.out.println("no need for gas");
		} else {
			System.out.println("need gas");
		}
	}
}
