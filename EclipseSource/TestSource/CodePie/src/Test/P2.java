package Test;
import java.util.Scanner;


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
