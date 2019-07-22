package Algorithm;

import java.util.Arrays;
public class Algorithm07 {

	public static void main(String[] args) {
		//다음에 저장된 알파벳을 사전 순으로 정렬하시오
		
		char arr[] = {'c', 'f', 'a', 'm', 'b'};
		char tmp = arr[0]; 
		int[] integer = new int[arr.length]; 
		
		//내림차순
		for (char c=0; c < arr.length-1; c++) {
			for (char j = (char) (c+1); j < arr.length; j++) {
					if (arr[c] > arr[j]) {
						tmp = arr[j];
						arr[j] = arr[c];
						arr[c] = tmp; 
					}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i < arr.length-1; i++) {
			for (int j = (char)(i+1); j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp; 
					}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			integer[i] = arr[i]; 
		}
		System.out.println(Arrays.toString(integer));
		
		
	}

}
