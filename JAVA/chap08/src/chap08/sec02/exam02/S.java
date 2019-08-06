package chap08.sec02.exam02;
import java.util.Scanner; 
public class S {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i=1; i<=n; i++) {
			for (int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
		sc.close(); 
	}

}
