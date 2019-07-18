package chap04.sec02.exam05;

public class ThreeByThreeMatrix {
	public static void main (String[] args) {
		for (int i=0; i<=2; i++) {
			for (int j=0; j<=2; j++) {
				//System.out.print(i+j+"\t");
				System.out.print((i+j) + ((j!=2)? "," : ""));
			}
			System.out.print("\n"); 
		}
		System.out.println("-----------------------------------------");
		for (int i=0; i<=2; i++) {
			for (int j=0; j<=2; j++) {
				System.out.print("(" + i + "," + j + ") =" + (i+j) + "\t");
			}
			System.out.print("\n"); 
		}
	}
}
