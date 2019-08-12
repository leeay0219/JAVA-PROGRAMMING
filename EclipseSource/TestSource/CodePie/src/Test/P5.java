package Test;
import java.util.*; 
public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		int[] sum = new int [t]; 
		
		for(int i=0; i<t; i++) {
			String s = sc.nextLine(); 
			String[] strArr = s.split("");
			Arrays.sort(strArr);
			
			String a = new String();
			String b = new String();
			
			for (int j=0; j<strArr.length; j++) {
				a += ("" + strArr[j]);
			}
			
			for (int j=strArr.length-1; j>=0 ; j--) {
				b += ("" + strArr[j]);
			}
			
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
			
			sum[i] = num1+num2; 
		}	
		
		for (int i=0; i<t; i++) {
			System.out.print("Case #" + (i+1) + "\n"); 
			System.out.println(sum[i]); 
		}
		sc.close();
	}
}

