package Algorithm;
import java.util.Arrays;

public class Algorithm06 {

	public static void main(String[] args) {
		//다음 배열 요소 중 문자열로만 구성 된 새로운 배열 생성
		String[] arr = new String[6];
		arr[1] = "a";
		arr[3] = "z";
		arr[5] = "java";
		int len = 0; 
		
		String[] arr2 = null;
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				len += 1;
			}
		} 
				
		arr2 = new String[len];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr2[j] = arr[i];
				j++; 
			}
		}
	
		System.out.println(Arrays.toString(arr2));
		
	}

}
