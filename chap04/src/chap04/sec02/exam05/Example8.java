package chap04.sec02.exam05;

public class Example8 {

	public static void main(String[] args) {
		int num1, num2; 
		
		/* do {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
		} while (num1 + num2 != 5);
		*/ 
	
		System.out.println("---------------------------");
		
		while(true) {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			
			if (num1 + num2 != 5) {
				System.out.println("(" + num1 + "," + num2 + ")");
			} 
			else {
				System.out.println("(" + num1 + "," + num2 + ") is added up to 5"); 
				break; 
			}
		} 
	}

}
