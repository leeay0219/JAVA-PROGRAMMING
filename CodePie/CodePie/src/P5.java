import java.util.*; 
public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine()); 
		
		for (int i=0; i<t; i++) {
			String s = sc.nextLine();
			String[] a = s.split("");
			String fir = new String(); 
			String sec = new String(); 
			
			int num1 = 0;
			int num2 = 0;
			int sum = 0; 
			
			Arrays.sort(a);
			for (int j=0; j<a.length; j++) {
				fir += "" + Integer.parseInt(a[j]);
			}
			
			for (int j=a.length; j>0; j--) {
				sec += "" + Integer.parseInt(a[j-1]);
			}
			
			num1 = Integer.parseInt(fir); 
			num2 = Integer.parseInt(sec); 
			sum = num1 + num2; 
			
			System.out.println("Case #" + (i+1));
			System.out.println(sum);
			
		}
		sc.close();
	}
}
