package Tests;
import java.util.Scanner; 

public class kmp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("-");
		String str = "";
		for(int i = 0; i<arr.length; i++) {
			str += arr[i].substring(0, 1);
		}
		System.out.println(str);

	}
}
