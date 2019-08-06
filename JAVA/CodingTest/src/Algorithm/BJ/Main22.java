package Algorithm.BJ;
import java.util.Scanner; 
public class Main22 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if (flip(n) < flip(m)) {
			System.out.print(flip(m));
		} else if (flip(n) > flip(m)) {
			System.out.print(flip(n));
		}
		sc.close();
	}
	
	public static int flip(int num) {
		int result = 0; 
		while (num != 0) {
			result = result*10 + num%10;
			num /=10; 
		}
		return result;
	}
}
