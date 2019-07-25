import java.util.Scanner; 
public class CodePie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine()); 
		int sum = 0; 
		
		for (int i=0; i<n;i++) {
			int m = sc.nextInt();
			int o = sc.nextInt();
			System.out.println("Case #" + (i+1)); 
				for (int j=0; j<m; j++) {
					sum = m + o; 
				}
			System.out.println(sum);
		}
		sc.close();
	}	

}


