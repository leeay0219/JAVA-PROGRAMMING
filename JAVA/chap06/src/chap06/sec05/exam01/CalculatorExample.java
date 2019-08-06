package chap06.sec05.exam01;

public class CalculatorExample {
	public static void main (String[] args) {
		
		double result1 = Calculator.times(10, 10) * Calculator.pi;
		int result2 = Calculator.plus(5, 7);
		int result3 = Calculator.minus(5, 1);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3); 
	}
}
