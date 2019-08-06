package Algorithm.BJ;
import java.util.*; 

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0; 
		char answer = '?'; 
		String s = sc.next().toUpperCase();
		int[] index = new int[24];
		
		for (int i=0; i<s.length(); i++) {
			index[s.charAt(i)-65]++;
			if (max < index[s.charAt(i)-65]) {
				answer = s.charAt(i);
				max = index[s.charAt(i)-65];
			}
			else if (max == s.charAt(i)-65) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}

}