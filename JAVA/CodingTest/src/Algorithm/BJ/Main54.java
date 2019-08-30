package Algorithm.BJ;
import java.util.*; 
public class Main54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		String[] a = new String[n];
		int count = 0; 

		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextLine();
			a[i] += a[i];
			
			if (a[i].contains(s)) {
				count++;
			}
		}

		System.out.println(count);
		
		sc.close();
	}

}
