package Algorithm.BJ;
import java.util.*; 
public class Main64 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		while(s.length()%3 != 0) {
			s = "0" + s; 
		}

		String r = "";
		int j = 0; 
		
		for(int i=0; i<s.length()/3; i++) {
			String tmp = s.substring(j, j+3);
	         switch (tmp) {
	            case "000" : System.out.print(0); break;
	            case "001": System.out.print(1); break;
	            case "010": System.out.print(2); break;
	            case "011": System.out.print(3); break;
	            case "100": System.out.print(4); break;
	            case "101": System.out.print(5); break;
	            case "110": System.out.print(6); break;
	            case "111": System.out.print(7); break;
	         }
	         j += 3;
		}
		
		System.out.println(r);
		sc.close();
	}
}

