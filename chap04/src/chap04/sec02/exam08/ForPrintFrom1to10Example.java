package chap04.sec02.exam08;

public class ForPrintFrom1to10Example {

	public static void main(String[] args) {
				for (int i=0; i<4; i++) {
					for (int j=0; j<4; j++) {
						if (j<=i) {
					System.out.print("");
						}
					}
					System.out.print("*");
				}
	}

}
