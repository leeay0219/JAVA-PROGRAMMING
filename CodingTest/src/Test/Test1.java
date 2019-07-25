package Test;
public class Test1 {
	public static void main (String[] args) {
		for (int i=1; i<=9; i++) {
			for (int j=9; j>=2; j--) {
				System.out.print(j + "x" + i + "=" +  (i*j) + "\t");
			}
			System.out.println(""); 
		}
		
	}
}
