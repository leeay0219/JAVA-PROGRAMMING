package C6.Package;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); 
		car.setSpeed(-50);
		System.out.println("current speed: " + car.getSpeed());
		
		car.setSpeed(60);
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("current speed: " + car.getSpeed());
		
	}

}
