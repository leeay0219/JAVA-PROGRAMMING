package chap06.sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator(); 
		double result1 = cal.areaSqu(10); 
		double result2 = cal.areaRec(10, 20);
		System.out.println("Square area:" + result1); 
		System.out.println("Rectangle area:" + result2); 
	}

}
