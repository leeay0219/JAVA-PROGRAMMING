package Algorithm.BJ;
import java.util.*; 
public class Main43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int [5];
		int m = sc.nextInt();
		int n = sc.nextInt(); 
		sc.nextLine();
		
		char [][] window = new char[501][501]; 
		
		for (int i=0; i<5*m*1; i++) {
			for (int j=i; j>0; j--) {
				window[i][j] = sc.next().charAt(j);
			}
		}
		
		for (int i=1; i<5*m+1; i+=5) {
			for (int j=1; j<5*n+1; j+=5) {
				for (int w = i; w<i+4; w++) {
					if (window[w][j] == '.') {
						count[w-i]++;
						break; 
					}
					if (w==i+3) 
						count[4]++;
				}
			}
		}
		
		for (int i=0; i<5; i++) {
			if (i<4) {
				System.out.print(count[i] + " ");
			} else 
				System.out.print(count[i]);
		}
		sc.close();
	}

}
