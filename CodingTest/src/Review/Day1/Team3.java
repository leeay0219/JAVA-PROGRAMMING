package Review.Day1;
//x보다 작은 수

//문제 : 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서
//X보다 작은 수를 모두 출력하는 프로그램을 작성하시오
//입력 : 첫째 줄에 N과 X가 주어진다.
//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
//출력 : X보다 작은 수를 입력 받은 순서대로 공백으로 구분해 출력한다.
//      X보다 작은 수는 적어도 하나 존재한다.
//예제 입력 1 
//10 5
//1 10 4 9 2 3 8 5 7 6
//예제 출력 1
//1 4 2 3
import java.util.Scanner; 
public class Team3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[x]; 
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] < n) {
			System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}

}
