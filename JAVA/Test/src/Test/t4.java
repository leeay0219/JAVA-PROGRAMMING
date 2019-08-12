package Test;
import java.util.Scanner; 
public class t4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine()); 
	
		String s = sc.nextLine();
		
		Character[] ch = new Character[s.length()];
		
		for (int i=0; i<n; i++) {
			ch[i] = s.charAt(i);
		}
		
		for (int i=0; i<ch.length; i++) {
			if (ch[i] == 'w') {
				System.out.print('a');
			} else if (ch[i] == 'x') {
				System.out.print('b');
			} else if (ch[i] == 'y') {
				System.out.print('c');
			} else if (ch[i] == 'z') {
				System.out.print('d');
			} else {
				ch[i] = (char)(ch[i] + 4);
				System.out.print(ch[i]);
			}
		}
		sc.close(); 
	}

}
