package chap12.sec01.exam07;

public class Example {

	public static void main(String[] args) {
		//sharing object
		Calculator shareCalc = new Calculator();
		
		//thread object 
		User1 user1 = new User1(); 
		user1.setCalculator(shareCalc);
		user1.start();
	}

}
