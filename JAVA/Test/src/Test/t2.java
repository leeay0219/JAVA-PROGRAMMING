package Test;
//샘플 가이드 코드입니다. 본인의 코드를 사용하셔도 됩니다.
//package 선언 금지
import java.util.Scanner;

//사용하는 클래스명은 Problem ID 이어야 합니다.

class t2 {
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine());
		int[]a = new int[t]; 
		int[]b = new int[t]; 
		int[]sum = new int[t];
		
		for (int i=0; i<t; i++) {
			a[i] = sc.nextInt(); 
			b[i] = sc.nextInt(); 
			sum[i]=a[i]+b[i];
		}
		
		for (int j=0; j<t; j++) {
			System.out.print("Case #" + (j+1) + "\n");
			System.out.println(sum[j]);
		}
		sc.close();
	}
}
