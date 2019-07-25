package chap07.sec02.exam003;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i=1; i<=5; i++) {
			int problemLocation = car.run();
		
			switch(problemLocation) {
			case 1:
				System.out.println("Front Left change to HanKookTire");
				car.fLTire = new HankookTire("Front Left", 15);
				break; 
			case 2:
				System.out.println("Front Left change to HanKookTire");
				car.fRTire = new HankookTire("Front Right", 13);
				break; 
			case 3:
				System.out.println("Front Left change to HanKookTire");
				car.bLTire = new HankookTire("Back Left", 14);
				break; 
			case 4:
				System.out.println("Front Left change to HanKookTire");
				car.bRTire = new HankookTire("Back Right", 17);
				break; 
		}
		System.out.println(" ----------------------------- ");
		}
	}

}
