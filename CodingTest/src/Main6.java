import java.util.*;
public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	 
		System.out.println("숫자입력");	 
		String s = sc.nextLine(); 
		String[] a = s.split(" ");
		Arrays.sort(a);
		String[] b = s.split(" ");
		Arrays.parallelSort(b, Collections.reverseOrder());
		
		
		
	}

}
