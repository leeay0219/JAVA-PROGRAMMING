package Algorithm.BJ;
import java.util.*;

public class Main29 {
	static int n;
	
	public static void main(String[]args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		System.out.println(moo(n,0));
		sc.close();
	}
	
	public static int len(int k) { // S(k)의 길이 
		  int x;
		  if (k == -1) 
			  return 0; 
		  x = len(k-1);
		  return x + (k+3) + x;
	}
	
	public static char moo(int n, int k) { //S(k)의 n번째 char 리턴 
		  if (n > len(k)) 
			return moo(n, k+1);
		  if (n <= len(k-1)) 
			  return moo(n, k-1);
		  n = n - len(k-1); 
		  if (n <= k+3) 
		    return (n == 1) ? 'm' : 'o'; //n이 1이면 m, 아니면 o 출력
		  n = n - (k+3);
		  return moo (n, k-1);
	}
	
}
