package chap06.sec04.exam04;

public class Calculator {
	int add (int x, int y) {
		int sum = x + y; 
		return sum; 
	}
	
	double avg (int x, int y) {
		double sum = x + y;
		double avg = sum / 2;
		return avg; 
	}
	
	void execute () {
		double result = avg (7, 10);
		println("result: " + result);
	}
	
	void println(String message) {
		System.out.println(message); 
	}
}
