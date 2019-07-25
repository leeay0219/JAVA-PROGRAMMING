package Review.Day2;
//첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
//
//두 번째로 큰 정수를 출력한다.
//
//입력
//20 30 10
//출력
//20
import java.util.*;

public class Team3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3]; 
		for (int i=0; i<num.length; i++) {
			num[i] = sc.nextInt(); 
		}
		Arrays.sort(num);
		System.out.println(num[1]);
		sc.close(); 
	}
}

