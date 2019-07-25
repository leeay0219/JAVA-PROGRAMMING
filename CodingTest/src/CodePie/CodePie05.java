package CodePie;
import java.util.*; 
public class CodePie05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); 
		String[] strArr = s.split("");
		String a = new String();
		String b = new String();
		
		Arrays.sort(strArr);
		for (int i=0; i<strArr.length; i++) {
			a += ("" + strArr[i]);
		}
		
		for (int i=s.length()-1; i>=0 ; i--) {
			b += ("" + strArr[i]);
		}
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		System.out.println(num1);
		System.out.println(num2); 
		System.out.println(num1+num2);

	}
}

