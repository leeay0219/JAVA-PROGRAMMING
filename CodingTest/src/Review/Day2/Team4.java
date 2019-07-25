package Review.Day2;
//n개의 자연수가 주어졌을때, 가장 큰 두 수를 출력한다.
//입력
//5
//1 6 7 5 3
//
//출력
//7 6
//
//입력
//10
//46 12 100 60 30 10 74 98 4 62
//
//출력
//100 98

import java.util.Scanner; 
import java.util.Arrays;
public class Team4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n]; 
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt(); 
		}
		Arrays.sort(arr); 
		System.out.println(arr[n-1] + " " + arr[n-2]); 
		sc.close();
	}

}
