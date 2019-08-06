package chap06.sec03.exam07;

public class Car {
	//field
	String company;
	String model; 
	int speed;
	
	Engine engine;
	Tire[] tires = new Tire[4];

	//Constructor (생성자)
	Car() {
		
	}
	
	Car(String company, String model, Engine engine, Tire[] tires){ 
		this.company = company;
		this.model = model;
		this.engine = engine; 
		this.tires = tires;
	}
}
