package chap06.sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); 
//		System.out.println("Company: " + myCar.company);
//		System.out.println("Model: " + myCar.model);
//		System.out.println("Colour: " + myCar.colour);
//		System.out.println("MaxSpeed: " + myCar.maxSpeed);
//		System.out.println("CurrentSpeed: " + myCar.speed); 
//		System.out.println("EngineStart: " + myCar.engineStart);
//		System.out.println("Owner: " + myCar.owner);
//		
		myCar.info();  
		
		myCar.speed = 60; 
		System.out.println("ChangedSpeed: " + myCar.speed); 
		
		myCar.engineStart = true; 
		System.out.println("EngineStatus: " + myCar.engineStart);
		
		myCar.owner = "Ah Yeong Lee";
		System.out.println("OwnerChanged: " + myCar.owner);
		
		System.out.println("================================");
		Car yourCar = new Car(); 
		yourCar.speed = 100; 
		yourCar.info();
		
	}

}
