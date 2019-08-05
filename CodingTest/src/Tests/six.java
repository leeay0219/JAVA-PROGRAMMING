package Tests;
import java.util.Scanner;

public class six {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = Integer.parseInt(sc.nextLine()); //10
			sc.close();
			int n = 1; 
			while (num > 0) {
				n++; 
				String str = String.valueOf(n);
				if (str.contains("666")) {
					num--; 
				}
			}
			System.out.println(n);
	}

}
