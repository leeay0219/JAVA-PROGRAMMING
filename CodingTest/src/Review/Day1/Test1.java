package Review.Day1;
import java.util.Scanner; 

public class Test1  {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int[] n = new int[10]; 
	int[] r = new int[n.length]; 
	int[] s = new int[r.length]; 
	int count = 0; 
	
	for (int i=0; i<n.length; i++) {
		n[i] = Integer.parseInt(sc.nextLine()); 
		r[i] = n[i]%42;
	}
	
	for (int i=0; i<n.length-1; i++) {
		for (int j=i+1; j<n.length; j++) {
			if (r[i] == r[j]) {
				s[j] = 1; 
			}
		}
	}
	for (int i=0; i<s.length; i++) {
		if (s[i] == 0) {
			count++; 
		}
	}
	System.out.println(count); 
		
		sc.close(); 
		
	}
}