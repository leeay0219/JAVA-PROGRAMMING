package Hard;

import java.util.Arrays;

//0이상 9이하의 자연수 10개 중 5개를 무작위추출한다. 
//단 이때 5개의 자연수 중 겹치는 숫자는 없어야 한다. 
//추출된 다섯 개의 자연수의 배치로 만들 수 있는 최댓값과 최솟값을 구한다. 
//산출값은 추출된 값, 최댓값, 최솟값, 최댓값과 최솟값의 합 이렇게 네 개다.

public class Team3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		String a = new String();
		String b = new String();
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*9) + 1;
			for (int j=0; j<i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		for (int i=0; i<arr.length; i++) {
			a += ("" + arr[i]);
		}
		for (int i = arr.length-1; i>=0; i--) {
			b += ("" + arr[i]);
		}
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		System.out.println(num1);
		System.out.println(num2); 
		System.out.println(num1+num2);
		
	}

}
