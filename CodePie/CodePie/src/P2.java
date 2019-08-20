import java.util.*; 
public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine());

		for (int i=0; i<t; i++) {
			int num1 = sc.nextInt(); 
			int num2 = sc.nextInt(); 
			sc.nextLine();
			int sum = 0; 
			sum = num1+num2; 
			System.out.println("Case #" + (i+1));
			System.out.println(sum); 
		}
		
		sc.close();
	}

}
