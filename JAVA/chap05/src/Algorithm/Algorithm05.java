package Algorithm;

import java.util.Arrays;

public class Algorithm05 {

	public static void main(String[] args) {
		//다음 배열의 요소 중 0이 아닌 요소로 구성된 새로운 배열 생성, 출력
		int[] arr = {0, 5, 0, 7, 0, 6};
		int[] arr2 = null; 
		int len = 0; 
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				len += 1;
			}
		} 
		
		arr2 = new int[len];
		int j = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr2[j] = arr[i];
				j++; 
			}
		}
		
		
		System.out.print(Arrays.toString(arr2));
		
	}

}

