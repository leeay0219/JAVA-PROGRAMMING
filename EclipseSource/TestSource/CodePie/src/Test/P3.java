package Test; 
import java.util.Scanner;

class t1 {
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine()); 
		
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(sc.nextLine());
			String s = sc.nextLine();
			char[] ch = s.toCharArray();
			
			for (int j=0; j<n; j++) {
				if (ch[j] == 'w') {
					ch[j] = 'a';
				} else if (ch[j] == 'x') {
					ch[j] = 'b';
				} else if (ch[j] == 'y') {
					ch[j] = 'c';
				} else if (ch[j] == 'z') {
					ch[j] = 'd';
				} else 
					ch[j] += 4;
			}
			System.out.print("Case #" + (i+1) + "\n");
			System.out.println(ch);
		}
		
		sc.close();
	}
}