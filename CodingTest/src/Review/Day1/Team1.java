package Review.Day1;
//CodePie1
import java.util.Scanner;
public class Team1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str = "Hello Hanwha!";
		String[] s = new String[n];
		
		for (int i = 0; i<n; i++) {
			s[i] = sc.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Case #" + (i+1)); 
			for (int j = 0; j < Integer.parseInt(s[i]); j++) {
				System.out.println(str);
			}
		}
		
		sc.close();
	}

}
