package chap12.sec01.exam07;

public class User1 extends Thread {
	private Calculator calculator;
	
	public User1() {
		setName("User1");
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	} 
	
	@Override 
	public void run() {
		calculator.setMemory(100);
	}

}
