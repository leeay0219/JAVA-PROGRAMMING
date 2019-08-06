package Tests;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
            if (s.equals("END")) {
            	break;
            }
            else { 
            	System.out.println(new StringBuffer(s).reverse().toString());
            }
		}
		
		sc.close();
	}

}

