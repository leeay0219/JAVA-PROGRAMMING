package Algorithm.BJ;
import java.util.*; 

public class Main52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String[] s = new String[5];
		String ss = "";
		
		for (int i =0; i<5; i++) {
			s[i] = sc.nextLine(); 
			ss += s[i]; 
			
		}
		
		for (int i=0; i<5; i++) {
			if (s[i].contains("FBI")) {
				if (i<4) {
					System.out.print((i+1) + " ");
				} else {
					System.out.print((i+1));
				}
			}
		}
		
		if (!ss.contains("FBI")) {
			System.out.print("HE GOT AWAY!");
		}
		
		sc.close();
	}

}
