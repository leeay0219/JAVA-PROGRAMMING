package chap05.sec01.exam01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i=0; i<n; i++) {
			String s = sc.next(); 
			String tmp[] = s.split(",");
			int a = Integer.parseInt(tmp[0]); 
			int b = Integer.parseInt(tmp[1]);
			System.out.println(a+b);
		}
		sc.close(); 
	}

}

