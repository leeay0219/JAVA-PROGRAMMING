import java.util.*; 
public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		int[] a = new int [t];
		for (int i=0; i<t; i++) {
			a[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i=0; i<t; i++) {
			System.out.println("Case #" + (i+1));
			for (int j=0; j<a[i]; j++) {
				System.out.println("Hello Hanwha!");
			}
		}
		sc.close(); 
	}

}
