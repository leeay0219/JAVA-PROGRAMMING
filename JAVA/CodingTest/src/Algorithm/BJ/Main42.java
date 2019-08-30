package Algorithm.BJ;
import java.util.*; 

public class Main42 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Map <String, Integer> map = new HashMap<>();
		
		for (int i=0; i<n; i++) {
			String s = sc.nextLine();
			if (map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.put(s, i++);
			}
		}
		
		for (int i=0; i<n-1; i++) {
			String s = sc.nextLine();
			map.put(s, i--);
		}
		
		for (String key : map.keySet()) {
			System.out.println(key);
		}
	}
}
