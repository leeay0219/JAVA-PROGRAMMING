package BJ;
import java.util.Scanner; 

public class Main9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		int max = 0; 
		char ch = '?'; 
		int[] cnt = new int[26];
		
		for (int i=0; i<s.length(); i++) {
			cnt[s.charAt(i)-65]++; //toUpperCase 이용하여 변환하면 아스키코드에 65를 빼야 0부터 시작
			if (max < cnt[s.charAt(i)-65]) {
				max = cnt[s.charAt(i)-65];
				ch = s.charAt(i);  
			} else if (max == cnt[s.charAt(i)-65]) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		sc.close(); 
	}
}
