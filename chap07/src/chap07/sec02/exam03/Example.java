package chap07.sec02.exam03;

public class Example {

	public static void main(String[] args) {
		Tire t1 = new Tire();
		Tire t2 = new HankookTire();
		Tire t3 = new KumhoTire(); 
		
		t1.roll();
		t2.roll();
		t3.roll();
	}

}
