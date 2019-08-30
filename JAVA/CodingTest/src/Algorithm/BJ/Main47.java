package Algorithm.BJ;
import java.util.Scanner; 

public class Main47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int [26];
		int max = 0;  
		boolean flag = true; 
		
		while (sc.hasNextLine() && flag) {
			String tmp = sc.nextLine(); 
			for (int i=0; i<tmp.length(); i++) {
				if (tmp.charAt(i) != ' ') {
					count [(int)(tmp.charAt(i)-'a')]++; 
					if (max < count[(int)(tmp.charAt(i)-'a')]) {
						max = count[(int)(tmp.charAt(i)-'a')];
					} 
				}
			}
			
			if (tmp.isEmpty()) {
				flag = false;
				break; 
			}
		}
		
		//(tmp.startsWith(" ") || tmp.endsWith(" ") && !sc.hasNextLine()) || tmp.length() > 2000 || tmp.isEmpty();		

		for (int i=0; i<count.length; i++) {
			if (count[i] == max) {
				System.out.print((char)(i+'a'));
			}
		}
		sc.close();
	}

}
