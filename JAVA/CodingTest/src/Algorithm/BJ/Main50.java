package Algorithm.BJ;
import java.util.*; 
public class Main50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine());
		int count = 0; 
		
		HashSet <String> hs = new HashSet<>();
		for (int i=0; i<n; i++) {
			String s = sc.nextLine();
			if (hs.contains(s)) {
				continue;
			} else {
				count++;
				for(int j=0;j<s.length();j++) {
					String tmp = s.substring(j) + s.substring(0, j);
					hs.add(tmp);
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
