package Algorithm.BJ;
import java.util.*;
public class Main28 {
	
	static int a;
	static int b;
	static int n;
	static int[] result;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine()); //testcase
		for(int i=0; i<t; i++) {
			a = 0; 
			b = 0;
			n = 0; 
			
			a = sc.nextInt();
			b = sc.nextInt();
			n = sc.nextInt();
			sc.nextLine(); 

			result = new int[b-a+1];
			
			for (int j=0; j<result.length; j++) {
				System.out.print("Case #" + (i+1) + ": " + relativelyPrime(result[j], n));
			}
		}
	}
	
	public static int coPrime(int a, int b) {
		int tmp;
		while(b != 0) {
			tmp = a; 
			a = b; 
			b = tmp%b;
		}
		return a; 
	}
	
	private static boolean relativelyPrime(int a, int b) {
	    return coPrime(a,b) == 1;
	}

}
