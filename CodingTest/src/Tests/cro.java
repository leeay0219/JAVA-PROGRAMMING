package Tests;
import java.util.Scanner; 

public class cro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); 
		String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for (int i=0; i<strArr.length; i++) {
			s = s.replaceAll(strArr[i], "a");
		}
		System.out.println(s.length());
		sc.close(); 
	}

}