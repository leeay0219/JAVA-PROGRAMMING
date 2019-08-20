package Test;
import java.util.Scanner;

public class P7_2 {

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());        
		
		for(int i=0; i<t; i++) {
			String s = sc.nextLine();
			char[] ch = s.toCharArray();
			
			int stair = 0;
			int fast = 0;
			int cal = 0;
			
			for(int j=0 ; j<ch.length ; j++) {
				if(ch[j] == '#') {
					fast++;
				}
			
				if(fast % 2 != 1) {
					switch(ch[j]) {
					case '(':
						stair++;
						cal += stair;
						break;
					case ')':
						cal += stair;
						stair--;
						break;
					}
				} 
				
				else {
					switch(ch[j]) {
					case '(':
						stair++;
						cal += (stair * 2);
						break;
					case ')':
						cal += (stair * 2);
						stair--;
						break;
					}
				}
			}
			System.out.println("Case #" + (i+1));
			System.out.println(cal);
		}
		sc.close();
	}
}
