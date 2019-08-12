package Test;
// 샘플 가이드 코드입니다. 본인의 코드를 사용하셔도 됩니다.
//package 선언 금지
import java.util.Scanner;

// 사용하는 클래스명은 Problem ID 이어야 합니다.

class P1 {
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine()); 
		int[] a = new int[t]; 

		for (int i=0; i<t; i++) {
			a[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.println("Case #" + (i+1) + " ");
			for (int j=0; j<a[i]; j++) {
				System.out.println("Hello Hanwha!");
		}
		}
			sc.close();
	}
}
