package Review.Day1;
//코드파이1
import java.util.Scanner; 
public class Team2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine()); // case input
		String str = "Hello, Hanwha!";
		String[]s = new String [n];
		
		for (int i = 0; i < n;i++) {
			s[i] = sc.nextLine();
		}
		
		for (int j=0; j<s.length; j++) {
			System.out.println("Case #" + (j+1));
			for (int k=0; k<Integer.parseInt(s[j]); k++) {
				System.out.println(str); 
			}
		}
		
	}

}