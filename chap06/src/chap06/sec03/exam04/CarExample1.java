package chap06.sec03.exam04;

public class CarExample1 {

	public static void main(String[] args) {
		Car1 car1 = new Car1("그랜저", "금색");
		byte[] byteArr = {68, 69};
		Car1 car2 = new Car1(byteArr);
		char[] charArr = {'A', 'B'};
		Car1 car3 = new Car1(charArr);
		
		System.out.println(car1.model + car1.colour);
		System.out.println(car2.model);
		System.out.println(car3.model);
		
		
	}

}
