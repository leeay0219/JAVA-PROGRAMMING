package chap06.sec04.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator(); 
		cal.powerOn();
		
		int result1 = cal.add(10, 15);
		System.out.println(result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = cal.divide(x, y);
		System.out.println(result2); 
		
		cal.powerOff();
	}
}
