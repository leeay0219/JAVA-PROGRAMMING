package chap07.sec02.exam03;

public class Car {
	//field
	Tire t1 = new Tire();
	Tire t2 = new Tire(); 
	Tire t3 = new HankookTire();
	Tire t4 = new KumhoTire(); 
	//constructor
	//method
	public void run() {
		System.out.println("Car runs");
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll(); 
	}
	
	public void run(Tire tire) {
		tire.roll();
	}
}
