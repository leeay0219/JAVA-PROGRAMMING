package CodePie;
import java.util.Scanner; 
public class CodePie_1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "Hello, Hanwha!";

		int n = Integer.parseInt(sc.nextLine()); 
		String[] m = new String[n];
		
		for (int i = 0; i < n;i++) {
			m[i] = sc.nextLine();
		}
		
		for (int j=0; j<m.length; j++) {
			System.out.println("Case #" + (j+1));
			for (int k=0; k < Integer.parseInt(m[j]); k++) {
				System.out.println(str); 
			}
			
		}
		
		sc.close();
	}
	
}
