package chap06.sec03.exam04;

public class Car {
	String company = "현대자동차";
	String model;
	String colour;
	int maxSpeed;
	
	Car() {
		
	}
	
	Car(String model) {
		this (model,"빨강", 250);
	}
	
	Car(String model, String colour) {
		this (model, colour, 250);
	}
	
	Car (String model, String colour, int maxSpeed) {
		this.model = model;
		this.colour = colour;
		this.maxSpeed =
				maxSpeed;
	}
}
