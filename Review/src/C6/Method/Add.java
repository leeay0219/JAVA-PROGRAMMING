package C6.Method;
import java.util.Scanner; 
public class Add {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int[] a = new int[5];
		for (int i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(add(a));
		sc.close();
	}
	
	public static int add(int[]a) {
		int sum = 0; 
		for (int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
}
