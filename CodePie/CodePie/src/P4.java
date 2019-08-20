import java.util.*; 
public class P4 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine()); 
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(sc.nextLine()); 
			int [] a = new int [n];
			int sum = 0;
			
			for (int j=0; j<n; j++) {
				a[j] = sc.nextInt();
			}
			sc.nextLine();
			
			String f = sc.nextLine();
			String s = sc.nextLine(); 
			
			for (int j=0; j<n; j++) {
				if (f.charAt(j) == 'O' && s.charAt(j) == 'O') {
					sum += a[j];
				}
			}
			System.out.println("Case #" + (i+1));
			System.out.println(sum); 
		}
		sc.close();
	}

}
