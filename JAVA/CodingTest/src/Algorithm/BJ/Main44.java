package Algorithm.BJ;
import java.util.*; 
public class Main44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); 
		int check = 0; 
		int ha = 0; 
		int sa = 0; 
		
		for (char c : s.toCharArray()) {
			if (c == ':' || (c == '-') && check == 1) {
				check++; 
				continue; 
			} else if (check == 2) {
				if (c=='(') sa++;
				else if (c==')') ha++;
			}
			check = 0; 
		}
		
		if (ha > sa) {
			System.out.println("happy");
		} else if (ha == sa && ha!=0) {
			System.out.println("unsure");
		} else if (sa > ha) {
			System.out.println("sad");
		} else {
			System.out.println("none");
		}
		
		sc.close();
	}

}
