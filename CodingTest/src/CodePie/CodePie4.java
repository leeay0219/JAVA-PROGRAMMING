package CodePie;
import java.util.Scanner; 
public class CodePie4 {

	public static void main(String[] args) {
		

		System.out.println("사과 수: "); 
		Scanner sc = new Scanner(System.in); 
		int apple = Integer.parseInt(sc.nextLine()); 
		int[] scores = new int[apple];
		String f;
		String s;
		int sum = 0; 
		
		System.out.println("점수>> ");
		for (int i =0; i< apple; i++) {
			scores[i] = Integer.parseInt(sc.next()); 
		}
			sc.nextLine(); 
			
			System.out.println("장애물1>> "); 
			f = sc.nextLine(); 
			
			System.out.println("장애물2>> "); 
			s = sc.nextLine(); 
			
			for (int j=0; j < apple; j++) {
				if (f.charAt(j)=='o' && s.charAt(j)=='o') {
					sum += scores[j]; 
				}
			}
			System.out.println(sum); 
	
			sc.close(); 
	}	 
}
		
