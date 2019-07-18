package chap04.sec02.exam05;

public class Staircase {

	public static void main(String[] args) {
		for (int i=1; i<6; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println ("-------------------");
		
		String s = "";  
		for (int i=1; i<6; i++) {
			s += i; 
			System.out.println(s);
		} 
	}

}

