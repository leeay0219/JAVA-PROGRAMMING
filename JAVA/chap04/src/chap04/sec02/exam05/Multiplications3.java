package chap04.sec02.exam05;

public class Multiplications3 {

	public static void main(String[] args) {
		for (char i= 'A'; i<='C'; i++) {
			for (char j= 'A'; j<='E'; j++) {
				System.out.print("" + i + j + "\t");  // String.valueOf() 도 가능함 
			}
			System.out.println(); 
		}
		
	}
}