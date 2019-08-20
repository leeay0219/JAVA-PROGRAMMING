import java.util.*; 
public class StringExam02 {

	public static void main(String[] args) {

		//전체케이스 
		//3
		//10 20
		//30 40 50 
		//60 70 80 90
		//450
		//2
		//100 200
		//200 300 400
		//1200
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine()); 
		
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(sc.nextLine()); 
			String s = new String();
			String ss = new String(); 
			
			for (int j=0; j<n; j++) {
				s = sc.nextLine();
				ss += s; 
			}
			
			String[] a = ss.split(",");
			int sum = 0;
			
			for (int j=0; j<a.length; j++) {
				String[] arr = new String[a[j].split(" ").length];
				arr = a[j].split(" ");
				for (int k=0; k<arr.length; k++) {
					sum += Integer.parseInt(arr[k]);
				}
			}
			
			System.out.println("Case #" + (i+1));
			System.out.println(sum); 
		} 
		
		sc.close();
	}

}
