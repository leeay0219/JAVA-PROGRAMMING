package chap07.sec01.exam03;

public class Computer extends Calculator{
	
	public double areaCircle(double r) {
		System.out.println("Computer객체의 areaCircle() 실행");
		return Math.PI * r * r; 
	}
	
	public void setting() {
		System.out.println("Setting Son");
	}
}
