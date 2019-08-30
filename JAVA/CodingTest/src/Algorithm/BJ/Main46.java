package Algorithm.BJ;
import java.util.*;
public class Main46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int[] alpha = {2, 22, 222, 3, 33, 333, 4, 44, 444, 5, 55, 555, 6, 66, 666, 7, 77, 777, 7777, 8, 88, 888, 9, 99, 999, 9999 };
		int[] number = new int[10];
		
		for (int i=1; i<10; i++) {
			int temp = 0;
			temp = sc.nextInt();
			number[temp] = i; 
		}
		
		String s = sc.nextLine(); 
		String [] a = s.split(" ");
		
		int pre = -1; 
		
		for (int i=0; i<s.length(); i++) {
			char[] ch = a[i].toCharArray();
			int temp = alpha[ch[i] - 'a'];
			if (pre == temp%10) {
				System.out.print("#");
			}
			
			for (int j=temp; j>=0; j--){
				System.out.print(number[temp%10]);
				pre = temp%10; 
				temp /= 10; 
			}
		}
		
		System.out.println();
		
		sc.close();
	}

}
