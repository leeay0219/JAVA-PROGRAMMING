package Algorithm.BJ;
import java.util.*; 
public class Main57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine();
		String cam = "CAMBRIDGE"; 
		char[] ch = cam.toCharArray();
		
		for (int i=0; i<ch.length; i++) {
			if (s.contains((ch[i]) + "")) {
				s = s.replaceAll(ch[i] + "", "");
			}
		}
		
		System.out.print(s);
		sc.close();
	}

}
