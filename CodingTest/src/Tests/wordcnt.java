package Tests;
import java.util.*;
public class wordcnt { 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
	        
			for (char ch = 'a'; ch <= 'z'; ch++) {
				System.out.print(s.indexOf(ch) + " ");
			}
	       sc.close();
	}

}

