package CodePie;
import java.util.Scanner; 

public class CodePie3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cnt = sc.nextLine(); 
		String password = sc.nextLine();
		char c; 
			
		for (int i=0; i<Integer.parseInt(cnt); i++) {
			c = password.charAt(i); 
			c += 4; 
			System.out.print(c);
		}
		
		sc.close(); 
	}

}
