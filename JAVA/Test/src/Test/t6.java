package Test;
import java.util.*; 
public class t6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine();
		String[] a = {"c=", "c-", "dz=", "z=", "d-", "lj", "nj", "s="}; 
		for (int i=0; i<s.length(); i++) {
			s = s.replaceAll(a[i], "a");
		}
		System.out.println(s.length()); 
		sc.close(); 
	}

}
