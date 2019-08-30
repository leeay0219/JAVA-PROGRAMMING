package Algorithm.BJ;
import java.util.*; 
public class Main60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s; 
		do {
			s = sc.nextLine();
			char[] ch = s.toCharArray();
			boolean check = true; 
			
	        for (int i = 1; i < s.length()-1; i++) {
	            char a = 0;
	            char b = 0;
	            for (int j = 0; j < s.length()-i; j++) {
	                    a = ch[j];
	                    b = ch[j+i];

	                for (int k = j+1; k < s.length()-i; k++) {
	                    if (a == ch[k] && b == ch[k+i]) {  
	                        check = false;
	                        break;
	                    }
	                }
	                
	                if (!check) {
	                    break;
	                }
	            }
	            
	            if (!check) {
	                break;
	            }
	            
	        }
	        
	        if (!s.equals("*")) {
		        System.out.print(s);
		        
		        if (check) {
		            System.out.println (" is surprising.");
		        }
		        
		        if (!check) {
		            System.out.println(" is NOT surprising."); 
		        }
	        }
	 
		} while (!s.equals("*"));
		
		sc.close();
	}

}
