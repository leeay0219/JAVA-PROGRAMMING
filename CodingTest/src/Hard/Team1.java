package Hard;
//소수구하기
import java.util.Scanner;
public class Team1 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int m = sc.nextInt(); 
				
				for (int i=n; i<=m; i++) {
					int j; 
					for (j=2; j<i; j++) {
						if (i%j == 0) {
							break;
						}
					}
					if (i==j) {
						System.out.println(i); 
					}
				}
		}
}
