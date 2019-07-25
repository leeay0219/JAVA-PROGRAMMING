package BJ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays; 
import java.util.Scanner; 

public class Main1 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> b = new ArrayList<>();
		for (int i = 0; i<n; i++) {
			String s = sc.nextLine();
			b.add(s);
		}
		Collections.sort(b);
		String[] arr = new String[b.size()]; 
		arr = b.toArray(arr);
		
		ArrayList<String> answerList = new ArrayList<>();
		
		for (int i=0; i<m; i++) {
			String s = sc.nextLine();
			int index = Arrays.binarySearch(arr, s);
			if (index >= 0) {
				answerList.add(s);
			}
		}
		Collections.sort(answerList);
		
		System.out.println(answerList.size());
		for (String s : answerList) 
			System.out.println(s);
	}	
}
