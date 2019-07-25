package chap07.sec02.exam003;

public class Car {
	Tire fLTire = new Tire ("Front Left", 6);
	Tire fRTire = new Tire ("Front Right", 2);
	Tire bLTire = new Tire ("Back Left", 3);
	Tire bRTire = new Tire ("Back Right", 4); 
	
	int run() {
		System.out.println("runs"); 
		if (fLTire.roll() == false) {
			stop(); return 1; 
		}
		if (fRTire.roll() == false) {
			stop(); return 2;
		}
		if (bLTire.roll() == false) {
			stop(); return 3; 
		}
		if (bRTire.roll() == false) {
			stop(); return 4; 
		}
		return 0;
	}
	void stop() {
		System.out.println("stops"); 
	}
}
