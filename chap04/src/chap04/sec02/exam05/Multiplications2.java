package chap04.sec02.exam05;

public class Multiplications2 {
	public static void main (String[]args) {
		
		for (int i=0; i<=2; i++) {
			for (int j=10; j<=50; j+=10) {
				System.out.print((i+j) + "\t");
			}
			System.out.print("\n"); 
		}
		
	}
}