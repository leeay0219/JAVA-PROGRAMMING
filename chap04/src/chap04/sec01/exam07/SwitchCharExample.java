package chap04.sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A': 
			case 'a':
				System.out.println("VIP"); 
				break;
			case 'B': 
			case 'b':
				System.out.println("Standard"); 
				break;
			case 'C': 
			case 'c':
				System.out.println("Guest"); 
				break;
		}	
	}

}
