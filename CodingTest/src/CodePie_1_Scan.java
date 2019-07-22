import java.util.Scanner; 
public class CodePie_1_Scan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "Hello, Hanwha!";
		int n = Integer.parseInt(sc.nextLine()); 
		
		for (int i=0; i<n;i++) {
			int m = Integer.parseInt(sc.nextLine());
			System.out.println("Case #" + (i+1)); 
			
				for (int j=0; j<m; j++) {
					System.out.println(str);
				}
		}
		sc.close();
	}
	
}
