package BJ;
import java.util.*; 
public class Main10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine(); 
		String[] strArr = str.split("");
		
		Arrays.sort(strArr, Collections.reverseOrder());
		for (int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i]);
		}
		sc.close(); 
	}

}
