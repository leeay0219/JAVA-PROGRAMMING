import java.util.*;
public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine()); 
		int b = Integer.parseInt(sc.nextLine()); 
		int c = Integer.parseInt(sc.nextLine()); 
		int result = a*b*c;
		String s = result + "";
		String[] arr = s.split(""); 
		int[] count = new int[10]; 
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<10; j++) {
				if (Integer.parseInt(arr[i]) == j) {
					count[j]++; 
				}
			}
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(count[i]);
		}
		
		sc.close(); 
	}

}
