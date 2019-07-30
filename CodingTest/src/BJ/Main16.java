package BJ;
import java.util.Scanner;
import java.util.StringTokenizer; 
public class Main16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s;
		
		for (int i=0; i<n; i++) {
			s = sc.nextLine();
			StringTokenizer t = new StringTokenizer(s);
			while (t.hasMoreTokens()) {
				System.out.print(new StringBuffer(t.nextToken()).reverse().toString() + " ");
			}
			System.out.println(); 
		}
		sc.close();
	}

}

