package CodePie;
import java.util.Scanner; 

public class CodePie3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		while (true) {
			if (n<1||n>10) {
				n = Integer.parseInt(sc.nextLine());
			} else {
				break;
			}
		}
		
		char[] ch = sc.nextLine().toCharArray();
		while (true) {
			if (ch.length != n) {
				ch = sc.nextLine().toCharArray();
			} else
				break; 
		}
		
		for (int i=0; i<n; i++) {
			switch(ch[i]) {
			case 'w':
				ch[i] = 'a';
				break;

			case 'x':
				ch[i] = 'b';
				break; 
				
			case 'y':
				ch[i] = 'c';
				
			case 'z':
				ch[i] = 'd';
				
			default:
				ch[i] += 4;
				break;
			}
		}
		
		for (int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		sc.close(); 
	}

}
