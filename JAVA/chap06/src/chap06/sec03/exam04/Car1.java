package chap06.sec03.exam04;

public class Car1 {
	String model;
	String colour; 
	
	Car1(String model, String colour) {
		this.model = model;
		this.colour = colour; 
	}
	Car1(byte[]model) {
		this.model = new String(model);
	}
	Car1(char[] model) {
		this.model = new String(model);
	}
	
}
