package Algorithm.SWExpertAcademy;
import java.util.*; 
public class Cipher {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();

		for (int i=0; i<10; i++) {
			int n = Integer.parseInt(sc.nextLine());
			String s = sc.nextLine();
			
			for (int j=0; j<n; j++) {
				String[] a = s.split(" ");
				list.add(a[j]);
			}
			
			int m = Integer.parseInt(sc.nextLine());
			String ss = sc.nextLine();
			String[]b = ss.split("I ");
			
			for (int j=1; j<b.length; j++) {
				String[]c = b[j].split(" ");
				for (int k=0; k<Integer.parseInt(c[1]); k++) {
					list.add(Integer.parseInt(c[0])+k, c[k+2]);
				}
			}
			
			System.out.print("#" + (i+1));
			
			for (int j=0; j<10; j++) {
				System.out.print(" " + list.get(j));
			}
		}
		sc.close();
	}
}
