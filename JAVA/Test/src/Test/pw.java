package Test;
import java.util.*;
public class pw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine()); 
		String[] a = new String[n]; //01234
		
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextLine(); //0
		}
		
		for (int i=0; i<a.length; i++) {
		for (int j=1; j<a.length; j++) { // 1 2 3 4
			if (a[i].equals(a[j])) {
				System.out.println(a[j].length());
				break; 
			} 
		}
		
		sc.close(); 
	}

}
}
