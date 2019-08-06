import java.util.*;
public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [7];
		int[] b = new int [7]; 
		int sum = 0; 
		
		for (int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(sc.nextLine());
			if (a[i]%2 != 0) {
				b[i] = a[i];
				sum += b[i];
			}
		}
		
		if (sum==0) {
			System.out.println(-1); 
		} else
			System.out.println(sum); 
		
		//È¦¼öÁß ÃÖ¼Ú°ª 
		Arrays.sort(b); 
		for (int i=0; i<b.length; i++) {
			if (b[i] != 0) {
				System.out.println(b[i]);
				break; 
			}
		}
		sc.close();
	}

}
