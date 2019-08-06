package chap06.sec02.exam01;

public class Car {
	String company = "현대자동차";
	String model = "그랜져";
	String colour = "검정";
	int maxSpeed = 350;
	int speed; 
	boolean engineStart; 
	String owner; 
	
	

	void info() {
		System.out.println("Company: " + company);
		System.out.println("Model: " + model);
		System.out.println("Colour: " + colour);
		System.out.println("MaxSpeed: " + maxSpeed);
		System.out.println("CurrentSpeed: " + speed); 
		System.out.println("EngineStart: " + engineStart);
		System.out.println("Owner: " + owner); //객체안에서는 생성자 필요없음 
	}
}


