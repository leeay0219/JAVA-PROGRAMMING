package Algorithm.BJ;
import java.util.*; 
public class Main58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		
		if (s.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(s.split(" ").length);
		}
		sc.close();
	}

}
