package Algorithm;
import java.util.Arrays;

public class Algorithm04 {

	public static void main(String[] args) {
		//�떎�쓬 諛곗뿴�쓽 �슂�냼瑜� �삱由쇱감�닚�쑝濡� �젙�젹
		int arr[] = {18, 12, 3, 5, 2, 9, 55, 4, 6, 11, 7};
		int tmp = arr[0]; 
		
<<<<<<< HEAD
		//내림차순
		for (int i=0; i < arr.length-1; i++) {
=======
		//�궡由쇱감�닚
		/* for (int i=0; i < arr.length; i++) {
>>>>>>> 1f0b33131b45db0d2d522cac64118fc5a477d142
			for (int j=i+1; j < arr.length; j++) {
					if (arr[i] < arr[j]) {
						tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp; 
					}
			}
		} */
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp; 
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//�삱由쇱감�닚
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
		
		//�삱由쇱감�닚
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
		
		//�궡由쇱감�닚
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
