package Algorithm;
import java.util.Arrays;

public class Algorithm04 {

	public static void main(String[] args) {
		//다음 배열의 요소를 올림차순으로 정렬
		int arr[] = {18, 12, 3, 5, 2, 9, 55, 4, 6, 11, 7};
		int tmp = arr[0]; 
		
		//내림차순
		for (int i=0; i < arr.length-1; i++) {
			for (int j=i+1; j < arr.length; j++) {
					if (arr[i] < arr[j]) {
						tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp; 
					}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//올림차순
		for (int i=0; i < arr.length-1; i++) {
			for (int j=i+1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp; 
					}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//올림차순
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j < arr.length; j++) {
					if (arr[i] < arr[j]) {
						tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp; 
					}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//내림차순
		for (int i=0; i < arr.length-1; i++) {
			for (int j=i+1; j < arr.length; j++) {
					if (arr[i] < arr[j]) {
						tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp; 
					}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
