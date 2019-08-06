package CodePie;
import java.util.Scanner; 
public class CodePie2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine()); 
		int[] m = new int[n];
		int[] o = new int[n];
		int[] sum = new int[n]; 

		for (int i = 0; i < n; i++)
		{
			m[i] = sc.nextInt(); 
			o[i] = sc.nextInt();
			sum[i] =  m[i] + o[i];
		}
		
		for (int j=0; j < m.length; j++) {
			System.out.println("Case #" + (j+1)); 
			System.out.println(sum[j]);
		}
		
		sc.close(); 
	}
	
}


