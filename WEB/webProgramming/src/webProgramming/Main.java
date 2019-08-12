package webProgramming;
import java.util.*; 
public class Main {

	private static int cntZero = 0;
    private static int cntOne = 0;
    static int[] d = new int[41];
	
	public static int dp(int x) {
		if(x <= 1 || d[x] != 0) 
			return d[x];
		else
			return d[x] = d[x-1] + d[x-2];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d[0] = 0; 
		d[1] = 1; 
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			System.out.printf("%d %d\n", dp(num), dp(num+1));
		}
		
		sc.close();
	}

}
