package chap05.sec01.exam01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int num; 
		int max = n[0];
		int min = n[0];
		
		for (int i=0; i<n.length; i++) {
			num = sc.nextInt();
			n[i] = num;
			if (n[i] > max) {
				max = n[i];
			} 
			if (n[i] < min) {
				min = n[i];
			}
		}
		
		System.out.print(min + "\t" + max);
		
		sc.close();
	}

}
