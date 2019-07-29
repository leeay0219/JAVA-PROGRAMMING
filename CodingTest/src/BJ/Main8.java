package BJ;
import java.util.Scanner; 

public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); 
		String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for (int i=0; i<strArr.length; i++) {
			s = s.replaceAll(strArr[i], "a"); //문자 배열에 든거 제외 아무거나 들어가도 됨
		}
		System.out.println(s.length());
		sc.close(); 
	}

}
