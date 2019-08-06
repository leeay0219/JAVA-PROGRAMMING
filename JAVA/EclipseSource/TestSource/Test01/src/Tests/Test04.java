package Tests;
import java.util.Scanner; 
public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] a = new int[n];
		int max = 0;
		double sum = 0;
		double avg = 0;
		double[] b = new double[n];
		
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			if (max < a[i]) {
				max = a[i];
			}
		}
		
		for (int i=0; i<a.length; i++) {
			b[i] = a[i] / (double)max*100;
		}
		
		for (int i=0; i<a.length; i++) {
			sum += b[i];
		}
		avg = sum/n;
		
		System.out.println(avg);
		
		sc.close();
	}

}
