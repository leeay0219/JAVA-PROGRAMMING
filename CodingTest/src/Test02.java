import java.util.Scanner; 
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
	
		for (int i=0; i<n; i++) {
			String str = sc.nextLine();
			String[] strArray = str.split(" ");
			double avg = 0; 
			int sum = 0;
			double student = 0;
			int num = Integer.parseInt(strArray[0]);
			
			for (int j=1; j<=num; j++) {
				sum += Integer.parseInt(strArray[j]);
			}
			avg = (double)(sum)/num;	

			for (int k=1; k<=num; k++) {
				if (Integer.parseInt(strArray[k]) > avg) {
					student = student+1;
				}
			} 
			student = student / num * 100; 
			System.out.printf("%.3f", student);
			System.out.println();		
		}
		sc.close();
		
	}
		
}