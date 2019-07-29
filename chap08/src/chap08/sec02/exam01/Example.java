package chap08.sec02.exam01;

public class Example {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		car.t1 = new KumhoTire();
		car.t3 = new KumhoTire(); 
		car.run();
	}

}
