package Algorithm.BJ;
import java.util.Scanner; 
public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int avg = 0;
		int sum = 0; 
		
		for (int i=0; i<5; i++) {
			int n = Integer.parseInt(sc.nextLine());
			if (n<40) {
				n = 40; 
			}
			sum += n;
			avg = sum/5;
		}
		System.out.println(avg);
		sc.close();
	}

}
