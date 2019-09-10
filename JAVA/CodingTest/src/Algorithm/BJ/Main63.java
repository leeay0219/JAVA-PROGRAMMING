package Algorithm.BJ;
import java.util.*;
public class Main63 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] a = n.split("");
		int ten = 0;
		String eight = new String(); 
		
		List<String> list = Arrays.asList(a);
		Collections.reverse(list); 
		a = list.toArray(new String[list.size()]);
		
		for (int i=0; i<a.length; i++) {
			if (Integer.parseInt(a[i]) == 0) {
				ten += 0; 
			} else {
				ten += Math.pow(2, i);
			}
		}
		
		if (ten >= 8) {
			eight = (ten/8) + "" + (ten%8);
			System.out.println(eight);
		} else {
			System.out.println(ten);
		}
		sc.close();
	}
}

