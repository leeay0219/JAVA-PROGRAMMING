package Review.Day1;
//CodePie2
import java.util.Scanner; 
public class Team5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] num1 = new int[n];
		int[] num2 = new int[n];
		int[] sum = new int[n];
		
		for (int i = 0; i<n; i++) {
			num1[i] = sc.nextInt(); 
			num2[i] = sc.nextInt(); 
			sum[i] = num1[i] + num2[i];
		}
		
		for (int i = 0; i < sum.length ; i++) {
			System.out.println("Case #" + (i+1));
			System.out.println(sum[i]); 
		}
		
		
		
	}

}
