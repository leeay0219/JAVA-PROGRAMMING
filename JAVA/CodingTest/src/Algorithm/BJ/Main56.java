package Algorithm.BJ;
import java.util.*; 

public class Main56 {

	static int[] love(String s) {
		int[] ch = new int[4];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='L')
				ch[0]++;
			else if(s.charAt(i)=='O')
				ch[1]++;
			else if(s.charAt(i)=='V')
				ch[2]++;
			else if(s.charAt(i)=='E')
				ch[3]++;
		}
		return ch;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String minsik = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		int[] ms = love(minsik);
		int count = 0;
		String date = "whoismydatessss";
		
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			int[] a = love(s);
			for(int j=0;j<4;j++) {
				a[j] += ms[j];
			}
			
			int luvrate = (a[0]+a[1])*(a[0]+a[2])*(a[0]+a[3])*(a[1]+a[2])*(a[1]+a[3])*(a[2]+a[3])%100;
			
			if (luvrate > count) {
				date = s;
				count = luvrate;
			} else if (luvrate == count && s.compareTo(date)<0) {
				date = s;
				
			}
		}
		System.out.println(date);
		sc.close();
	}
}
