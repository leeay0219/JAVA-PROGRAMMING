package Algorithm.BJ;
import java.util.*; 
public class Main39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); 
		String[] a = s.split(" ");
		int[] aa = new int [a.length];
		int[] bb = new int [aa.length];
		
		for (int i=0; i<a.length; i++) {
			aa[i] = Integer.parseInt(a[i]);
		}
		
		bb[0] = 1 - aa[0];
		bb[1] = 1 - aa[1];
		bb[2] = 2 - aa[2];
		bb[3] = 2 - aa[3];
		bb[4] = 2 - aa[4];
		bb[5] = 8 - aa[5];
		
		for (int i=0; i<bb.length; i++) {
			if (i == bb.length-1) {
				System.out.print(bb[i]);
			} else {
				System.out.print(bb[i] + " ");
			}
		}
		sc.close();
	}

}
