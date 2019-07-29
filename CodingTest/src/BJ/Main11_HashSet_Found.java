package BJ;
import java.util.*;
public class Main11_HashSet_Found {

	public static void main(String[] args) {
		//사람들 개똑똑함
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();
		int n = Integer.parseInt(sc.nextLine()); 
		
		
		for (int i=0; i<n; i++) {
			hs.add(sc.next());
		}
		
		String[] a = new String[hs.size()];
		hs.toArray(a);
		Arrays.sort(a); 
		Arrays.sort(a, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		for (String s : a) {
			System.out.println(s);
		}
		sc.close();
		
	}

}